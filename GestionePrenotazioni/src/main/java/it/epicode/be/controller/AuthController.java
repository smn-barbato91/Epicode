package it.epicode.be.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.epicode.be.model.User;
import it.epicode.be.repository.UserRepository;
import it.epicode.be.security.JwtUtils;
import it.epicode.be.security.UserDetailsImpl;
import it.epicode.be.security.login.LoginRequest;
import it.epicode.be.security.login.LoginResponse;
import it.epicode.be.service.implementations.UserService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class AuthController {
	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	private UserService userService;

	@Autowired
	JwtUtils jwtUtils;
	
	@PutMapping("/aggiornaPassword")
	public ResponseEntity<String> aggiornaPassword(){
		int agg = userService.adeguaPassword();
		return new ResponseEntity<>("Numero password aggiornate: "+ agg,HttpStatus.OK);
	}
	
	@PostMapping("/registrazione") 
	public ResponseEntity<String> registraUtente(@RequestBody User u) {
		log.info("email {}", u.getEmail());
		log.info("nome " + u.getNome());
		log.info("username " + u.getUsername());
		log.info("password " + u.getPassword());
		userService.salvaUtente(u);
		return ResponseEntity.ok("Salvataggio utente avvenuto con successo: " + u.getUsername());
	}

	@PostMapping("/login")
	public ResponseEntity<LoginResponse> authenticateUser(@RequestBody LoginRequest loginRequest) {
		log.info("Entro nel metodo di login con il parametro LoginRequest, username:" + loginRequest.getUsername() + " password:" + loginRequest.getPassword());
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
		log.info("Ho eseguito l'autenticazione");
		
		//authentication.getAuthorities();
		SecurityContextHolder.getContext().setAuthentication(authentication); // impostiamo nel SecurityContext le autenticazioni relative all'utente che si sta loggando
		String jwt = jwtUtils.generateJwtToken(authentication);// creazione del token(stringa)

		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();//principal=utente loggato in quel momento.
		List<String> roles = userDetails.getAuthorities().stream().map(item -> item.getAuthority())
				.collect(Collectors.toList()); // traduce il set di role in una lista di stringhe. Infine viene restituita una RE con un LoginResponse

		return ResponseEntity.ok(
				new LoginResponse(jwt, userDetails.getId(), userDetails.getUsername(), userDetails.getEmail(), roles, userDetails.getExpirationTime()));
	}
	
	
}
