package CollectionsDemo.MapDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo3 {

    public static void main(String[] args) {


    LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();
        hm.put(12,"Amol");
        hm.put(13,"Supriya");
        hm.put(42,"Navanath");
        hm.put(34,"Navanath");

        System.out.println("hm="+hm);

        LinkedHashMap<Integer,String> hm2 = new LinkedHashMap<>();

        hm2.putAll(hm);

        System.out.println("hm2="+hm2);
    }
}
