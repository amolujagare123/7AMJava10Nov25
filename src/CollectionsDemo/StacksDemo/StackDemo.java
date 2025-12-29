package CollectionsDemo.StacksDemo;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();
        s.push("Mumbai");
        s.push("Pune");
        s.push("Delhi");
        s.push("Bengaluru");
        s.push("Chennai");
        s.push("Hyderabad");
        s.push("Kolkata");
        s.push("Jaipur");

        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);
    }
}
