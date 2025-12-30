package CollectionsDemo.MapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {


    LinkedHashMap hm = new LinkedHashMap();
        hm.put(12,"Amol");
        hm.put(13,"Supriya");
        hm.put(42,"Navanath");
        hm.put(45.67,'s');
        hm.put(true,11);
        hm.put(4.52,12.5);

        System.out.println(hm);
    }
}
