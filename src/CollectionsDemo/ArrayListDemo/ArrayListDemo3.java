package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

    public static void main(String[] args) {

       ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(45);
        al.add(11);
        al.add(15);
        al.add(13);
        al.add(55);
        al.add(17);
        al.add(35);

        System.out.println(al);
        System.out.println("size="+al.size());
        System.out.println(al.get(6));

        System.out.println("using for loop *******>>>");
        for (int i=0;i<al.size();i++)
            System.out.println(al.get(i));

        System.out.println("using for each loop *******>>>");
        for(int x : al)
            System.out.println(x);

        System.out.println("using Iterator *******>>>");

        Iterator itr = al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
