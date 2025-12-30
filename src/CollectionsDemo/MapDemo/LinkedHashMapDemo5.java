package CollectionsDemo.MapDemo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo5 {

    public static void main(String[] args) {


    LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();


        hm.put(12,"Amol");
        hm.put(13,"Supriya");
        hm.put(42,"Navanath");
        hm.put(34,"Navanath");

        System.out.println("hm="+hm);

        Set<Integer> keys = hm.keySet();
        System.out.println("keys="+keys);

        Collection<String> values = hm.values();
        System.out.println("values="+values);


        Set entrySet = hm.entrySet();
        System.out.println("entrySet="+entrySet);


    }
}
