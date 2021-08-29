package it.epicode.be;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.SystemPropertyUtils;

import it.epicode.be.model.Edificio;
import it.epicode.be.model.Postazione;
import it.epicode.be.model.Prenotazione;
import it.epicode.be.repository.EdificioRepository;
import it.epicode.be.repository.PrenotazioneRepository;
@Component
public class ProvaJpa implements CommandLineRunner{
	
	@Autowired
	private PrenotazioneRepository prenotRepo;
	
	@Autowired
	private EdificioRepository edRepo;

	@Override
	public void run(String... args) throws Exception {
		
//		List<Edificio> le = edRepo.findAll();
//		for(Edificio e : le) {
//			System.out.println(e.getListaPostazioni().size());
//		}
		
//		Optional<Edificio> ed = edRepo.findById(1l);
//		if(ed.isPresent()) {
//			Edificio e = ed.get();
//			System.out.println(e.getClass().getName());
//			System.out.println(e.getNome());
//			List<Postazione> listaPost = e.getListaPostazioni();
//			for(Postazione p : listaPost) {
//				System.out.println(p.getId());
//			}
//		} 
		
		LocalDate data = LocalDate.of(2021, 10,2);
		LocalDate data2 = LocalDate.of(2021,12,9);
		int d2 = data2.getMonthValue();
		int d1 = data.getMonthValue();
		System.out.println(d2-d1);
		
	}

}
