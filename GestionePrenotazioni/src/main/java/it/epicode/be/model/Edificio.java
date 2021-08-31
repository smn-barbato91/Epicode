package it.epicode.be.model;

import java.util.List;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import it.epicode.be.security.encryption.CifratoreStringa;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Edificio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String indirizzo;
	private String citta;
	@OneToMany(mappedBy = "edificio")
	@JsonIgnore // inutile se usiamo Dto come output(data transfer object)-->altrimenti va in loop
	private List<Postazione> listaPostazioni;
	@Convert(converter=CifratoreStringa.class)
	private String codiceAllarme;
	
	public Edificio(long id, String nome, String indirizzo, String citta,String codiceAllarme) {
		this.id = id;
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.citta = citta;
		this.codiceAllarme = codiceAllarme;
	}
	
	
}


