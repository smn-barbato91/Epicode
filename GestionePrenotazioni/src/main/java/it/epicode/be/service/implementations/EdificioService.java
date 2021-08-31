package it.epicode.be.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.be.model.Edificio;
import it.epicode.be.repository.EdificioRepository;
import it.epicode.be.service.abstractions.AbstractEdificioService;
@Service
public class EdificioService implements AbstractEdificioService {
	
	@Autowired
	private EdificioRepository edRepo;

	@Override
	public Edificio salvaEdificio(Edificio e) {
		
		return edRepo.save(e);
	}

	@Override
	public List<Edificio> listaEdifici() {
		
		return edRepo.findAll();
	}
	

}
