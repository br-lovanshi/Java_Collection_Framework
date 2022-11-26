package UseCase;

import java.util.List;

import javax.persistence.EntityManager;

import Entities.Collage;
import Entities.Student;
import Util.EMUtill;

public class StudentsByClg {

	public static void main(String[] args) {
		
		EntityManager em = EMUtill.getProvideConnection();
		
		Collage clg = em.find(Collage.class, 31);
		
		List<Student> st = clg.getSlist();
		
		for(Student s : st) {
			
			System.out.println("Roll " + s.getStudentRoll());
			System.out.println("Name " + s.getStudentName());
			System.out.println("Email "  + s.getEmail());
			System.out.println("Phone " + s.getMobileNumber());
		}
		
		
	}
}
