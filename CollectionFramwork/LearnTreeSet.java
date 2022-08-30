package CollectionFramwork;

import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();

        /** time compaxcity is O(logn)
        it use binary searching
        it is tree + set  **/


       ts.add(2);
        ts.add(3);
        ts.add(39);
        ts.add(10);
        ts.add(10);

        ts.add(13);
        ts.size();//int size
        ts.isEmpty();// boolean
        ts.contains(3); //boolean
        ts.remove(3);

    }
}
