package it.epicode.be.controller.api;

import java.util.List;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.epicode.be.controller.api.dto.ElencoRegole;
import it.epicode.be.controller.api.dto.PrenotazioneDto;
import it.epicode.be.eccezioni.BusinessLogicException;
import it.epicode.be.eccezioni.EntityNotFoundException;
import it.epicode.be.model.Prenotazione;
import it.epicode.be.model.User;
import it.epicode.be.repository.PrenotazioneRepository;
import it.epicode.be.service.abstractions.AbstractReservationService;

@RestController
@RequestMapping("/api/prenotazioni")
public class PrenotazioneRestController {

	private AbstractReservationService prenotService;

	@Autowired
	public PrenotazioneRestController(AbstractReservationService prenotService) {
		this.prenotService = prenotService;
	}
	
	@GetMapping("miePrenotazioni")
	@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
	public ResponseEntity<List<PrenotazioneDto>> listaPrenotazioniPerUtenteLoggato(){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String username = authentication.getName();
		
		List<Prenotazione> prenotazioni = prenotService.listaPrenotazioniByUtenteLoggato(username);
		List<PrenotazioneDto> prenotazioniDto = prenotazioni.stream().map(PrenotazioneDto::fromPrenotazione)
				.collect(Collectors.toList());
		return new ResponseEntity<List<PrenotazioneDto>>(prenotazioniDto, HttpStatus.OK);
	}
	
	@GetMapping
	@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
	public ResponseEntity<List<PrenotazioneDto>> listaPrenotazioni() {
		List<Prenotazione> prenotazioni = prenotService.listaPrenotazioni();
		List<PrenotazioneDto> prenotazioniDto = prenotazioni.stream().map(PrenotazioneDto::fromPrenotazione)
				.collect(Collectors.toList());

		return new ResponseEntity<List<PrenotazioneDto>>(prenotazioniDto, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
	public ResponseEntity<?> getPrenotazioneById(@PathVariable long id) {
		Optional<Prenotazione> cercata = prenotService.getPrenotazioneById(id);
		if (cercata.isEmpty()) {
			return new ResponseEntity<>("Prenotazione non trovata", HttpStatus.NOT_FOUND);
		}
		PrenotazioneDto prenotDto = PrenotazioneDto.fromPrenotazione(cercata.get());
		return new ResponseEntity<>(prenotDto, HttpStatus.OK);
	}

	@PostMapping
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<?> insertPrenotazione(@RequestBody PrenotazioneDto prenotazioneDto) {

		Prenotazione pre = prenotazioneDto.toPrenotazione();
		try {
			Prenotazione inserita = prenotService.insertPrenotazione(pre);
			return new ResponseEntity<>(PrenotazioneDto.fromPrenotazione(inserita), HttpStatus.CREATED);
		} catch (EntityNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		} catch (BusinessLogicException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/{id}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<?> updatePrenotazione(@PathVariable long id, @RequestBody PrenotazioneDto prenotazioneDto){
		if(id != prenotazioneDto.getId()) {
			return new ResponseEntity<>("Gli id non coincidono", HttpStatus.BAD_REQUEST);
		}
		Prenotazione p = prenotazioneDto.toPrenotazione();
		try {
			prenotService.updatePrenotazione(p);
			return new ResponseEntity<>(PrenotazioneDto.fromPrenotazione(p),HttpStatus.OK);

		} catch (EntityNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		} catch (BusinessLogicException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
	}

	@GetMapping("/regole/{lingua}")
	@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
	public ResponseEntity<String> getRisposta(@PathVariable String lingua) {
		try {
			ElencoRegole regole = prenotService.getRulesByLang(lingua);
			return new ResponseEntity<String>(regole.getRegole(), HttpStatus.OK);
		} catch (BusinessLogicException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<?> eliminaPrenotazioneById(@PathVariable long id) {

		try {
			prenotService.deletePrenotazioneById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (EntityNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}
	


}
