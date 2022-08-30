package CollectionFramwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class learnList {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);

        List<Integer> al2 = new ArrayList<>();
        al2.add(40);
        al2.add(50);
        al2.add(1,100);
        al2.addAll(al);
        al2.set(3,10000);
        al2.remove(1);

        al2.remove(Integer.valueOf(20));
        System.out.println(al2);
        al2.clear();
        System.out.println(al.contains(1));

        for(int i = 0;i<al2.size();i++){
            System.out.println(al2.get(i));
        }
        for(int i :al2){
            System.out.println(i);
        }
        Iterator<Integer> it =  al2.iterator();

        while(it.hasNext()){
            System.out.println("itrator " +  " " + it.next());
        }




    }


}