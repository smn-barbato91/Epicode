package it.epicode.be.service.abstractions;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import it.epicode.be.controller.api.dto.ElencoRegole;
import it.epicode.be.eccezioni.BusinessLogicException;
import it.epicode.be.eccezioni.EntityNotFoundException;
import it.epicode.be.model.Prenotazione;
import it.epicode.be.model.User;

public interface AbstractReservationService {

	List<Prenotazione> listaPrenotazioni();

	Optional<Prenotazione> getPrenotazioneById(long id);

	Prenotazione insertPrenotazione(Prenotazione prenotazione) throws BusinessLogicException, EntityNotFoundException;

	ElencoRegole getRulesByLang(String lingua) throws BusinessLogicException;
	
	void deletePrenotazioneById(long id) throws EntityNotFoundException;
	
	void updatePrenotazione(Prenotazione p) throws BusinessLogicException;

	List<Prenotazione> listaPrenotazioniByUtenteLoggato(String username);

}