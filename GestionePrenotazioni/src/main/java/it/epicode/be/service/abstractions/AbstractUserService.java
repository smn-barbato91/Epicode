package it.epicode.be.service.abstractions;

import it.epicode.be.model.User;

public interface AbstractUserService {
	
	User salvaUtente(User u);
	
	int adeguaPassword();
	
	
}
