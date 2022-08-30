package Map;

import sun.security.rsa.RSAUtil;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
                map.put("one",1);// key -- one , value 1;
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);

        map.putIfAbsent("five",10);
        System.out.println(map);

        System.out.println(map.containsKey("two"));
        System.out.println(map.containsValue(3)); // return boolean

//        itrat

        System.out.println( map.entrySet()); //this is the set of keys and values
        System.out.println(map.values());// this is the set of values
        System.out.println(map.keySet());// set of key

        for(Map.Entry<String,Integer> e : map.entrySet()){
//            get key and valeus
            System.out.println(e);
//          get all the keys
            System.out.println(e.getKey());

//            get all the values
            System.out.println(e.getValue());
        }


        for(String key : map.keySet()){
            System.out.println(key);
        }
        for(Integer values : map.values()){
            System.out.println(values);
        }
//        for(Map.Entry<String,Integer> kv : map.entrySet()){
//            System.out.println(kv);
//        }
    }
}
