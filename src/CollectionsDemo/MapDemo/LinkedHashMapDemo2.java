package CollectionsDemo.MapDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo2 {

    public static void main(String[] args) {


    LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();
        hm.put(12,"Amol");
        hm.put(13,"Supriya");
        hm.put(42,"Navanath");
        hm.put(34,"Navanath");

        System.out.println(hm);

        hm.put(13,"Xyz");

        System.out.println(hm);
    }
}
