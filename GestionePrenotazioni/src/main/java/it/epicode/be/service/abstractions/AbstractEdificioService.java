package it.epicode.be.service.abstractions;

import java.util.List;

import it.epicode.be.model.Edificio;

public interface AbstractEdificioService {
	
	Edificio salvaEdificio(Edificio e);
	List<Edificio> listaEdifici();
}
