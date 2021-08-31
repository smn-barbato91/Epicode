package it.epicode.be.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.epicode.be.model.Edificio;
import it.epicode.be.service.implementations.EdificioService;

@RestController
@RequestMapping("/api/edificio")
public class EdificioController {
	
	@Autowired
	private EdificioService edService;
	
	@PostMapping
	public ResponseEntity<Edificio> salvaEdificio(@RequestBody Edificio e) {
		
		return new ResponseEntity<Edificio>(edService.salvaEdificio(e),HttpStatus.CREATED);
	}
	
	@GetMapping
	@CrossOrigin(origins = "http://localhost:8080")
	public ResponseEntity<List<Edificio>> listaEdifici() {
		return new ResponseEntity<>(edService.listaEdifici(),HttpStatus.OK);
	}

}
