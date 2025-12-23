package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListARemoveAllDemo {

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

        System.out.println("al="+al);

        ArrayList<Integer> al2 = new ArrayList<>();
         al2.add(1);
         al2.add(1);
         al2.add(1);
         al2.add(1);
         al2.add(1);
         al2.add(1);
         al2.add(11);
         al2.add(15);
         al2.add(13);
         al2.add(55);
         al2.add(17);
        System.out.println("al2="+al2); //

        al2.removeAll(al);

        System.out.println("al2="+al2);
    }
}
