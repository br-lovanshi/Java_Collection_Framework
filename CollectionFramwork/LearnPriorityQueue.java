package CollectionFramwork;

import java.util.Comparator;
import java.util.Queue;
import java.util.PriorityQueue;
public class LearnPriorityQueue {
    public static void main(String[] args) {

Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

//min heap & max heap

        pq.offer(10);
        pq.offer(40);
        pq.offer(50);
        pq.offer(30);

        System.out.println(pq);

        pq.poll();

        System.out.println(pq.peek());
//
        pq.poll();

        System.out.println(pq);


    }
}
