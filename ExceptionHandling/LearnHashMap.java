package Day2Practise;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnHashMap {

	public LearnHashMap() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	
	Map<Integer,String> hm = new HashMap<>();
	
	hm.put(null, null);
	hm.put(1, "one");
	hm.put(2 ,"two");
	hm.put(3, "three");
	hm.put(4, "four");
	hm.put(null, "chill");
	hm.put(2, "TWO");
	hm.put(8, "six");
	
	System.out.println(hm);
	Set<Integer> keys = hm.keySet();
	for(Integer i : hm.keySet()) {
		System.out.println(i);
	}
	System.out.println(keys);
	
	keys.forEach(System.out::print);
	
	for(String str : hm.values()) {
		System.out.println(str);
	}
	
	Collection<String> val = hm.values();
	val.forEach(System.out::print);
	Set<Entry<Integer, String>> kv = hm.entrySet();
	
	kv.forEach(System.out::println);
	
	
//	key 
	
	
	Set<Integer> keyy = hm.keySet();
//	val
	Collection<String> valu = hm.values();
//	keyval
	Set<Entry<Integer,String>> kyval = hm.entrySet();
	
	System.out.println(kv);
	
	
}
}