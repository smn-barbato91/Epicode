package it.epicode.be.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Postazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String descrizione;
	@Enumerated(EnumType.STRING)
	private TipoPostazione tipo;
	private int numMaxOccupanti;
	@ManyToOne
	private Edificio edificio;
//	@OneToMany(mappedBy="postazione")//--->nome della variabile
//	private List<Prenotazione> p;
	
	
	public Postazione(String descrizione, TipoPostazione tipo, int numMaxOccupanti, Edificio edificio) {
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.numMaxOccupanti = numMaxOccupanti;
		this.edificio = edificio;
		
	}
	
	
}
