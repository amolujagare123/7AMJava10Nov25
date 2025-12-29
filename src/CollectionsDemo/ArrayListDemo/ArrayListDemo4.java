package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println(al.isEmpty()); // true

        al.add("Amit");
        al.add("Rahul");
        al.add("Suresh");
        al.add("Priya");
        al.add("Neha");
        al.add("Anjali");
        al.add("Vikram");
        al.add("Rohit");

        System.out.println(al.isEmpty()); // false

        System.out.println(al);


    }
}
