package CollectionsDemo.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("Amit");
        ll.add("Rahul");
        ll.add("Suresh");
        ll.add("Priya");
        ll.add("Neha");
        ll.add("Anjali");
        ll.add("Vikram");
        ll.add("Rohit");

        System.out.println(ll);

        ll.addFirst("First");
        ll.addLast("Last");


        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);


    }
}
