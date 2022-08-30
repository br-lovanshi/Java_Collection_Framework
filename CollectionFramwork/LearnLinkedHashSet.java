package CollectionFramwork;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {

    public static void main(String[] args) {
        Set<Integer> lhs = new LinkedHashSet<>();
//Same like HashSet but order mantain and its a linkedlist + Set
       lhs.add(2);
        lhs.add(3);
        lhs.add(39);
        lhs.add(10);
        lhs.add(10);

        System.out.println(lhs);
        System.out.println(lhs.size());
        System.out.println(lhs.isEmpty());
    }
}
