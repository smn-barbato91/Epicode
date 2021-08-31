package it.epicode.be.security;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.epicode.be.model.User;
import it.epicode.be.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.info("Sono entrato dentro loadUserByUsername, con nome utente:" + username);
		Optional<User> user = userRepository.findByUsername(username);
        log.info("Ho fatto il recupero dell'utente su DB, l'utente è presente? " + user.isPresent());
		if (user.isPresent()) {
	        log.info("Trovato utente con id " + user.get().getId() + ", costruisco il dto dell'utente");
			return UserDetailsImpl.build(user.get());
		} else {
	        log.info("L'utente non esiste nel DB");

			throw new UsernameNotFoundException("User Not Found with username: " + username);
		}
	}

}
