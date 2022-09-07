package Day2Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
//Student.java
 class learnStudent {
private int roll;
private String name;
private int mark;
public learnStudent() {
}
public learnStudent(int roll, String name, int mark) {
this.roll = roll;
this.name = name;
this.mark = mark;
}
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
//Day12: Map, Arrays and Collections classes, Iterator, Generics, Queue, Priority Queue 11
}
public int getMark() {
return mark;
}
public void setMark(int mark) {
this.mark = mark;
}
@Override
public String toString() {
	return "learnStudent [roll=" + roll + ", name=" + name + ", mark=" + mark + "]";
}


}
 class CompareToMarks implements Comparator<learnStudent>{

	@Override
	public int compare(learnStudent o1, learnStudent o2) {
		// TODO Auto-generated method stub
		return o1.getMark()<o2.getMark()?+1:-1;
	}
	 
 }
 class MyGen<T>{
	 T obj;
	 
	 public void add(T obj ) {
		 this.obj = obj;
	 }
	 public T get() {
		 return obj;
	 }
	 void print() {
		 System.out.println(obj);
	 }
 }
public class LearnMap {

	public  static  void printEle(List<? extends Number > stn) {
		
//		for(i : stn ) {
//			System.out.print(i);
//		}
		System.out.println(stn);
		
	}
 public static void main(String[] args) {
	 
	 List<learnStudent> al = new LinkedList<>();
	 al.add(new learnStudent(1,"ram",199));
	 al.add(new learnStudent(2,"shyam",200));
	 al.add(new learnStudent(3,"hari",488));
	 System.out.println(al);
	 List<learnStudent> al2 = new ArrayList<>();
	 al2.add(new learnStudent(1,"ram",199));
	 al2.add(new learnStudent(2,"shyam",200));
	 al2.add(new learnStudent(3,"hari",488));
	 System.out.println(al2);
	 
//	 learnStudent st = new learnStudent(1,"ram",100);
//	 learnStudent st2 = new learnStudent(2,"sgyam",200);
//	 List<learnStudent> stn = new ArrayList<>();
//	 stn.add(st);
//	 stn.add(st2);
//	 
//stn.add(new learnStudent(10,"Amit",780));
	 
//	 stn.add(new learnStudent(11,"abhi",980));
//	 stn.add(new learnStudent(12,"arwarya",830));
	 
//	 printEle(stn);
//	 Integer [] arr = {1,2,3,4,4};
//	 List<Integer> listAr = Arrays.asList(1,2,3,4,5);
//	 printEle(listAr);
//	 Character [] charArr = {'a','b','c','d'};
//	 printEle(charArr);
	 
//	 MyGen<String> str = new MyGen();
//	 str.add("one");
//	 str.add("two");
//	 MyGen<Integer> n = new MyGen();
//	 n.add(1);
//	 n.add(3);
//	 n.add(4);
//	 str.print();
//	 n.print();
//	 List<Integer> list = new ArrayList<>();
//	 MyGen<learnStudent> gen3  = new MyGen();
//	 gen3.add(new learnStudent(10,"Amit",780));
//	 
//	 gen3.add(new learnStudent(11,"abhi",980));
//	 gen3.add(new learnStudent(12,"arwarya",830));
//	 System.out.println(gen3.get());
//	 gen3.print();
//	 
	 
//	 CompareToMarks cm = new CompareToMarks();
//	 Map<learnStudent,String> hm = new TreeMap<>(cm);
//	 hm.put(new learnStudent(1,"ram",100), "mp");
//	 hm.put(new learnStudent(2,"lakhan",99), "up");
//	 hm.put(new learnStudent(3,"shtam",989), "rj");
//	 Set<Map.Entry<learnStudent,String>> kv = hm.entrySet();
//	 kv.forEach(System.out::println);
	 
	 
 }
 
//		
////		List<String> list1= Arrays.asList("one","two","three","four");
////		
////		System.out.println(list1);
////		Collections.sort(list1);
////		System.out.println(list1);
////		Collections.reverse(list1);
////		System.out.println(list1);
//////		Arrays.asList(null);
//		
//		
////		Map k V 
//		
//		Map<Integer,String> map = new HashMap<>();
//		map.put(1, "one");
//		map.put(2, "thwo");
//		map.put(3,"three");
//		map.put(5, null);
////		String n = map.get(map);
////		System.out.println(n);
//		Set<Integer> k = map.keySet();
//		Collection<String> v = map.values();
//		
//		Set<Entry<Integer, String>> kv = map.entrySet();
//		System.out.println(map.get(2) + " get mathod");
//		for(Entry<Integer, String> i : map.entrySet()) {
//			System.out.println(i.getValue());
//			System.out.println(i.getKey());
//		}
//		
//		map.put(100, null);
//		map.get(3);
//		map.remove(2);
//		map.containsKey(1);
//		map.size();
//		
//		Set<Integer> ky = map.keySet();
//		Collection<String> values = map.values();
//		
//		Set<Map.Entry<Integer, String>> kyval = map.entrySet();
//		kyval.forEach(System.out::println);
//		
//		
//	}
//
}
