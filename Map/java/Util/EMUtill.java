package Util;



	

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


	public class EMUtill {
	
	private static EntityManagerFactory emf ;
	
	static {
		
		emf = Persistence.createEntityManagerFactory("CollegeUnit");
		
	}
	
	public static EntityManager getProvideConnection() {
		
		return emf.createEntityManager();
	}
}


