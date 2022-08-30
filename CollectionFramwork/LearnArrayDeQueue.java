package CollectionFramwork;

import java.util.ArrayDeque;

public class LearnArrayDeQueue {

    public static void main(String[] args) {

        ArrayDeque<Integer> ad = new ArrayDeque<>();
//        arr deque have to point first and last we can add or remove both end; /
        ad.offer(10); // add element normaly like queue

        ad.offerFirst(5);// add elements from first /

        ad.offerLast(15); // add elements from last

        ad.offerLast(40);
        System.out.println(ad);

        ad.poll(); // remove ele like que
        ad.offerFirst(20);
        System.out.println(ad);
ad.offerFirst(30);
        ad.pollFirst(); //remove from first

        System.out.println(ad);

        System.out.println(ad.peekFirst());

        ad.pollLast(); // poll from last end ;
ad.offerFirst(35);
        System.out.println(ad.peekLast());

    }
}
