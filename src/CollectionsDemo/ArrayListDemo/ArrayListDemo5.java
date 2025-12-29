package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo5 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Amit");
        al.add("Rahul");
        al.add("Suresh");
        al.add("Priya");
        al.add("Neha");
        al.add("Anjali");
        al.add("Vikram");
        al.add("Rohit");

        System.out.println(al);

        al.set(5,"XYZ");

        System.out.println(al);


    }
}
