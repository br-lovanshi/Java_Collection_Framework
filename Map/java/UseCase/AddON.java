package UseCase;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import Entities.Collage;
import Entities.Student;

import Util.EMUtill;

public class AddON {

	public static void main(String[] args) {
		
		EntityManager em = EMUtill.getProvideConnection();
		
		Collage clg = new Collage();
		
		clg.setCollageName("DAVV");
		clg.setCollageAddress("Indore");
		
		
		
		Student st1  = new Student();
		st1.setStudentName("Brajsh");
		st1.setEmail("Brajsh@gmail.com");
		st1.setClg(clg);
		st1.setMobileNumber(392921);
		
		
		Student st2  = new Student();
		st2.setStudentName("VIcky");
		st2.setEmail("vicky@gmail.com");
		st2.setClg(clg);
		st2.setMobileNumber(39292921);
		
		clg.getSlist().add(st1);
		clg.getSlist().add(st2);
		
		Collage clg1 = new Collage();
		
		clg1.setCollageName("IIT");
		clg1.setCollageAddress("Delhi");
		
		Student st3  = new Student();
		st3.setStudentName("Lussy");
		st3.setEmail("lussy@gmail.com");
		st3.setClg(clg1);
		st3.setMobileNumber(392921);
		
		
		
			Student st4  = new Student();
		st4.setStudentName("jack");
		st4.setEmail("jack@gmail.com");
		st4.setClg(clg1);
		st4.setMobileNumber(39292921);
			
		
		
		clg1.getSlist().add(st3);
		clg1.getSlist().add(st4);
		
		
		em.getTransaction().begin();
		em.persist(clg);
		em.persist(clg1);
		em.getTransaction().commit();
		
		System.out.println("Done");
	}
}
