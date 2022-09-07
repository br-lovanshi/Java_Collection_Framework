package Day2Practise;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
//import java.util.Map.Entry;

import org.w3c.dom.Entity;

class student {
	

		private int roll;
		private String name ;
		private int marks;
		
		
		
		public int getRoll() {
			return roll;
		}



		public void setRoll(int roll) {
			this.roll = roll;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public int getMarks() {
			return marks;
		}



		public void setMarks(int marks) {
			this.marks = marks;
		}



		public student(int roll, String name, int marks) {
			super();
			this.roll = roll;
			this.name = name;
			this.marks = marks;
		}






		@Override
		public String toString() {
			return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
		}



//		@Override
//		public int hashCode() {
//			return Objects.hash(roll);
//		}
//
//
//
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Student1 other = (Student1) obj;
//			return roll == this.roll;
//		}




	}

//	class sortbyMarks implements Comparator<Student1>{
//
//		@Override
//		public int compare(Student1 o1, Student1 o2) {
//			// TODO Auto-generated method stub
//			return o1.getMarks()<o2.getMarks()?+1:-1;
//		}
//		
//	}


public class LearnLinkedHashSet {


	
	public static void main(String[] args) {
		Map<studentTree11,String> lhs = new LinkedHashMap<>();
		lhs.put(new studentTree11(3, "br", 700), "delhi");
		lhs.put(new studentTree11(1, "brajesh", 200), "mp");
		lhs.put(new studentTree11(2, "vick", 300), "madhra");
		lhs.put(new studentTree11(3, "abhi", 100), "haryana");
		
		Set<studentTree11> key = lhs.keySet();
		Collection<String> val = lhs.values();
		Set<Map.Entry<studentTree11,String>> kv = lhs.entrySet();
		
//		kv.forEach(System.out::println);
		
		for(Map.Entry<studentTree11, String> i : lhs.entrySet()) {
			
			
			String state = i.getValue();
			System.out.println("state" + " " +state);
			System.out.println("------");
			studentTree11 st =  i.getKey();
			
			System.out.println("name " + st.getName());
			System.out.println("roll " + st.getRoll());
			System.out.println("marks " + st.getMarks());
			System.out.println("===========");
			
		}
	}

}
