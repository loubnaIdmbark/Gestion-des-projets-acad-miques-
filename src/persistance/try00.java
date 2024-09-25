package persistance;

import java.sql.Date;

import Metier.MetierPOJO.Projet;

public class try00 {

	    public static void main(String[] args) {
			
			DAOProjet projet = new DAOProjet();
			/*projet.insertProjetDoctorat("titre", Date.valueOf("2019-01-01"), "doctorat", "laboratoire1", 72, "r", "chef" , "p1");*/
			for(Projet p : projet.getAllProjetDoctorat()) {
				System.out.println(p.toString());
			}
		}
}

