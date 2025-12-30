package CollectionsDemo.QueDemo;

import java.util.ArrayDeque;

public class QueueDemo {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(20);
        adq.offer(21);
        adq.offer(30);
        adq.offer(24);
        adq.offer(50);
        adq.offer(26);
        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(100);

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);

    }
}
