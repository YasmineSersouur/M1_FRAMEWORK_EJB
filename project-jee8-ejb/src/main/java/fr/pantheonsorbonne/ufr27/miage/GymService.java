package fr.pantheonsorbonne.ufr27.miage;

import javax.ejb.Remote;

import fr.pantheonsorbonne.ufr27.miage.dao.entitiy.Card;

@Remote
public interface GymService {
	/**
	 * 
	 * @param lname customer name
	 * @param fname customer fname
	 * @return the id of the customer
	 */
	public int createMembership(String lname, String fname);

	public void cancelMemberShip(int userId) throws UserHasDebtException, NoSuchUserException;
}