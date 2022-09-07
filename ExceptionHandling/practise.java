package Day2Practise;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;

public class practise {

	public practise() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		Hashcode and equals for making it logicaly equal
		Set<studentTree11> q = new LinkedHashSet();
		q.add(new studentTree11(10, "N1", 500));
		q.add(new studentTree11(20, "N2", 400));
		q.add(new studentTree11(30, "N3", 440));
		q.add(new studentTree11(40, "N4", 1));
		q.add(new studentTree11(50, "N5", 380));
		q.add(new studentTree11(60, "N6", 550));
		q.add(new studentTree11(20, "N2", 400));
		q.add(new studentTree11(30, "N3", 440));
		q.add(new studentTree11(40, "N4", 1));
		q.add(new studentTree11(50, "N5", 380));
		q.add(new studentTree11(60, "N6", 550));
		q.forEach(System.out::println);
		
	}
}
