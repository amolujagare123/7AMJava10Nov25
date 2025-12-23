package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveDemo {

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

     al.remove(2) ;

     Integer ii = 35;
     al.remove(ii) ;



     System.out.println("al="+al);
        

    }
}
