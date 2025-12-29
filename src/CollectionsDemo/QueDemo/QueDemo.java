package CollectionsDemo.QueDemo;

import java.util.PriorityQueue;

public class QueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(20);
        pq.offer(21);
        pq.offer(30);
        pq.offer(24);
        pq.offer(50);
        pq.offer(26);

        System.out.println(pq); // 20,21,24,26,30,50

        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);


    }
}
