package CollectionsDemo.SetDemo;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet al = new HashSet();
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
