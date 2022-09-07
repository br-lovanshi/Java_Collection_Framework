package Day2Practise;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class studentTree {
	

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



		public studentTree(int roll, String name, int marks) {
			super();
			this.roll = roll;
			this.name = name;
			this.marks = marks;
		}
}

class compareToMarks11 implements Comparator<studentTree11>{

	@Override
	public int compare(studentTree11 o1, studentTree11 o2) {
		// TODO Auto-generated method stub
		return o1.getMarks()<o2.getMarks()?+1:-1;
	}
	
}
public class LearnTreeMap {

	public static void main(String[] args) {
		Map<studentTree11, String> tm = new  TreeMap<>(new compareToMarks11());
		tm.put(new studentTree11(1, "brajesh", 110), "Mp");
		tm.put(new studentTree11(10,"Ganesh",950),"Maharastra");
		tm.put(new studentTree11(12,"Surya",850),"Tamilnadu");
		tm.put(new studentTree11(15,"Venkat",920),"Telangana");
		tm.put(new studentTree11(16,"Dinesh",910),"Haryana");
		tm.put(new studentTree11(18,"Srinu",880),"Kerla");
		
		Set<Map.Entry<studentTree11,String>> key = tm.entrySet();
		
		for(Map.Entry<studentTree11, String> kvl : key ) {
			System.out.println("State " + kvl.getValue());
					
			studentTree11 i = kvl.getKey();
			System.out.println(i.getMarks());
			System.out.println(i.getName());
			System.out.println(i.getRoll());
			System.out.println("---------");
		}

		
	}


}
