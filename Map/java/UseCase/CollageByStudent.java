package UseCase;

import javax.persistence.EntityManager;

import Entities.Collage;
import Entities.Student;
import Util.EMUtill;

public class CollageByStudent {

	
	public static void main(String[] args) {
		
		EntityManager em = EMUtill.getProvideConnection();
		
		
		Student st = em.find(Student.class, 32);
		
		Collage clg = st.getClg();
		
		System.out.println(clg);
	}
}
