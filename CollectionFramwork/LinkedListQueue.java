package CollectionFramwork;

import java.util.LinkedList;

import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {

        Queue<Integer> que = new LinkedList<>();
        que.offer(10);
        que.offer(20);
        que.offer(30);
        que.offer(40);

        System.out.println(que);

        que.poll();

        que.peek();

        System.out.println(que.peek());

    }
}
