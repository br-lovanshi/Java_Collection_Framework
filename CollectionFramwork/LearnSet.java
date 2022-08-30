package CollectionFramwork;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

    public static void main(String[] args){

        Set<Integer> set = new HashSet<>();

/**  time complaxcity of all opration is O(1);
 duplilcate are not allowed
 sequence isn't  maintain  **/


        set.add(2);
        set.add(3);
        set.add(39);
        set.add(10);
        set.add(10);
        System.out.println(set);
        set.remove(3);
        System.out.println(set);
        System.out.println(   set.isEmpty());

        System.out.println( set.contains(10));
        int n  =set.size();
        System.out.println(n);

        for(Integer i : set){
            System.out.println(i);
        }

//        for(int i = 0;i<n;i++){
//            System.out.println(set);
//        }

    }
}
