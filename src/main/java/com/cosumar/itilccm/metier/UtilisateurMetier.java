package com.cosumar.itilccm.metier;

import com.cosumar.itilccm.entities.*;

public interface UtilisateurMetier {
	
	public void modifierUser(User u);
	public User getUser(Long id);

}
