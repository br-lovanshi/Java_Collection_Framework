package Map;

import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
    public static void main(String[] args){

        Map<String,Integer> tmap = new TreeMap<>();

        tmap.put("one",1);
        tmap.put("five",2);
        tmap.put("seven",3);
        tmap.put("two",2);
        tmap.put("zic",10);

        System.out.println(tmap);

        tmap.remove("five");

        System.out.println(tmap);

        for(Map.Entry<String,Integer> kv : tmap.entrySet()){
//            kv both
            System.out.println(kv);

//            keys
            System.out.println(kv.getKey());

//            values
            System.out.println(kv.getValue());
        }
//        all the key only in this loop
        for(String key : tmap.keySet()){
            System.out.println(key);
        }
//        all the value only int this loop
        for(Integer values : tmap.values()){
            System.out.println(values);
        }

    }
}
