package it.epicode.be.controller.api.dto;

import java.time.LocalDate;


import it.epicode.be.model.Edificio;
import it.epicode.be.model.Postazione;
import it.epicode.be.model.Prenotazione;
import it.epicode.be.model.TipoPostazione;
import it.epicode.be.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PrenotazioneDto {
	

	private long id;	
	private long idUtente;
	private String usernameUtente;
	private LocalDate dataPrenotazione;
	private LocalDate dataUtilizzo;
	private long idPostazione;
	private TipoPostazione tipoPostazione;
	private long edificioId;
	private String edificioNome;
	private String edificioCitta;
	
	
	public static PrenotazioneDto fromPrenotazione(Prenotazione p) {
		
		return new PrenotazioneDto(p.getId(),p.getUtente().getId(),p.getUtente().getUsername(),
				p.getDataPrenotazione(),p.getDataUtilizzo(),p.getPostazione().getId(),p.getPostazione().getTipo(),
				p.getPostazione().getEdificio().getId(),p.getPostazione().getEdificio().getNome(),
				p.getPostazione().getEdificio().getCitta());
	}
	
	public Prenotazione toPrenotazione() {
		Prenotazione p = new Prenotazione();
		
		User utente = new User();
		utente.setId(idUtente);
		utente.setUsername(usernameUtente);
		p.setUtente(utente);
		Edificio e = new Edificio();
		e.setId(edificioId);
		e.setNome(edificioNome);
		e.setCitta(edificioCitta);
		Postazione post = new Postazione();
		post.setId(idPostazione);
		post.setTipo(tipoPostazione);
		post.setEdificio(e);
		
		p.setId(id);
		p.setDataPrenotazione(dataPrenotazione);
		p.setDataUtilizzo(dataUtilizzo);
		p.setPostazione(post);
		
		return p;
		
		
		
	}
}
