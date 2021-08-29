package it.epicode.be.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.epicode.be.model.Postazione;
import it.epicode.be.model.TipoPostazione;

public interface PostazioneRepository extends JpaRepository<Postazione, Long>{
	
	public Page<Postazione> findByTipoAndEdificioCitta(TipoPostazione tipo, String citta, Pageable p);
	
	@Query("SELECT post FROM Postazione post WHERE post.edificio.citta = :citta AND post.tipo = :tipo "
			+ "AND post.id NOT IN (SELECT pre.postazione.id FROM Prenotazione pre WHERE pre.dataUtilizzo = :dataUtilizzo)")
	public Page<Postazione> findAvailableByTypeAndCity(String citta, TipoPostazione tipo,LocalDate dataUtilizzo ,Pageable p);
}
