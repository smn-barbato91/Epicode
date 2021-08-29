package it.epicode.be.model;

import java.time.LocalDate;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.UniqueElements;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Prenotazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	private User utente;
	private LocalDate dataPrenotazione;
	private LocalDate dataUtilizzo;
	@ManyToOne(fetch = FetchType.EAGER) // le relazioni verso One sono di default Eager(vengono lette da database in ogni caso)
										//,viceversa il default è Lazy(vengono lette solo se richiesto)
	@JoinColumn(name="postazione_id")  //nome di default della colonna foreign key
	private Postazione postazione;
	

	public Prenotazione(User utente, LocalDate data, Postazione postazione) {

		this.utente = utente;
		this.dataPrenotazione = data;
		this.postazione = postazione;
	}
	

}
