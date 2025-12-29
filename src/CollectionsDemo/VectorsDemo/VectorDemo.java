package CollectionsDemo.VectorsDemo;

import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        System.out.println("capacity="+v.capacity()); // 10
        System.out.println("size="+v.size());// 0

        v.add("Amit");
        v.add("Rahul");
        v.add("Suresh");
        v.add("Priya");
        v.add("Neha");
        v.add("Anjali");
        v.add("Vikram");
        v.add("Rohit");


        System.out.println("capacity="+v.capacity());//10
        System.out.println("size="+v.size()); //8

        v.add("Vikram");
        v.add("Rohit");

        System.out.println("capacity="+v.capacity());//10
        System.out.println("size="+v.size()); //10

        v.add("Rohit");

        System.out.println("capacity="+v.capacity());//20
        System.out.println("size="+v.size()); //11

        v.add("Amit");
        v.add("Rahul");
        v.add("Suresh");
        v.add("Priya");
        v.add("Neha");
        v.add("Anjali");
        v.add("Vikram");
        v.add("Rohit");
        v.add("Rohit");


        System.out.println("capacity="+v.capacity());// 20
        System.out.println("size="+v.size()); //20

        v.add("Rohit");


        System.out.println("capacity="+v.capacity());// 40
        System.out.println("size="+v.size()); //21


        System.out.println(v);



    }
}
