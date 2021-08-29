package it.epicode.be.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.epicode.be.model.Prenotazione;
import it.epicode.be.model.User;
import it.epicode.be.repository.PrenotazioneRepository;

@Controller
public class PrenotazioneController {

	@Autowired
	private PrenotazioneRepository prenotRepo;

	@GetMapping("/prenotazioni")
	public String listaPrenotazioni(Map<String, Object> model) {
		List<Prenotazione> lista = prenotRepo.findAll();
		model.put("prenotazioni", lista);
		return "prenotazioniPage";
	}

	@GetMapping("/prenotazioni/{id}")
	public String listaPrenotazioni(Map<String, Object> model, @PathVariable long id) {
		Optional<Prenotazione> cercata = prenotRepo.findById(id);
		if (cercata.isPresent()) {
			model.put("cercata", cercata.get());
			return "cercataPage";
		}
		return "prenotazioneNotFound";

	}
	@GetMapping("/prenotazioni/delete/{id}")
	public String deletePrenotazioneById(@PathVariable long id) {
		Optional<Prenotazione> daEliminare = prenotRepo.findById(id);
		if (daEliminare.isPresent()) {
			prenotRepo.deleteById(id);
			return "cancellazionePage";	
			}
		return "prenotazioneNotFound";

	}
	
	
	
	
}
