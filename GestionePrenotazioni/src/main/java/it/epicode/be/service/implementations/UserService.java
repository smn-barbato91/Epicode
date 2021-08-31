package it.epicode.be.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import it.epicode.be.model.User;
import it.epicode.be.repository.UserRepository;
import it.epicode.be.service.abstractions.AbstractUserService;

@Service
public class UserService implements AbstractUserService {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User salvaUtente(User u) {
		String passwordInChiaro = u.getPassword();
		String passwordHash = passwordEncoder.encode(passwordInChiaro);
		u.setPassword(passwordHash);
		return userRepo.save(u);
	}

	@Override
	public int adeguaPassword() {
		List<User> listaUtenti = userRepo.findAll();
		int conta = 0;
		for (User u : listaUtenti) {
			if (!u.getPassword().startsWith("$2")) {
				String passwordHash = passwordEncoder.encode(u.getPassword());
				u.setPassword(passwordHash);
				userRepo.save(u);
				conta++;
			}

		}
		return conta;

	}

}
