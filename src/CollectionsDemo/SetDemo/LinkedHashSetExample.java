package CollectionsDemo.SetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet al = new LinkedHashSet();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        al.add("Anuj");
        al.add(null);
        al.add(10);

        System.out.println(al.add("Anuj"));
        System.out.println(al);
    }
}
