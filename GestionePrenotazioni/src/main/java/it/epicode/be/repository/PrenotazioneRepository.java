package it.epicode.be.repository;

import java.time.LocalDate;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.epicode.be.model.Postazione;
import it.epicode.be.model.Prenotazione;
import it.epicode.be.model.TipoPostazione;
import it.epicode.be.model.User;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long>{
	
	public List<Prenotazione> findByUtenteId(long id);
	
	
	public List<Prenotazione> findByUtenteUsername(String username);
	
	@Query("SELECT p FROM Prenotazione p WHERE p.utente.id= :idUtenteParam AND p.dataUtilizzo= :dataUtilizzoParam")
	public List<Prenotazione> trovaPrenotazioniPerData(long idUtenteParam, LocalDate dataUtilizzoParam);
	
	public Page<Prenotazione> findByUtenteAndDataUtilizzo(User u, LocalDate dataUtilizzo, Pageable pageable);
	
	public Page<Prenotazione> findByPostazioneAndDataUtilizzo(Postazione postazione, LocalDate dataUtilizzo, Pageable pageable);

}
