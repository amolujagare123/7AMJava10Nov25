package CollectionsDemo.SetDemo;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet al = new TreeSet();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        al.add("Anuj");
        al.add("Supriya");
        al.add("navnath");


        System.out.println(al.add("Anuj"));
        System.out.println(al);
    }
}
