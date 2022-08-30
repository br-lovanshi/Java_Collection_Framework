package CollectionsClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(4);
        list.add(28);
        list.add(90);
        list.add(2);

        System.out.println("min " + Collections.min(list));
        System.out.println( "max " + Collections.max(list));
        System.out.println("frequency " + Collections.frequency(list,90));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);


    }
}
