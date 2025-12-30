package CollectionsDemo.MapDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo4 {

    public static void main(String[] args) {


    LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();

        System.out.println(hm.isEmpty());
        hm.put(12,"Amol");
        hm.put(13,"Supriya");
        hm.put(42,"Navanath");
        hm.put(34,"Navanath");
        System.out.println(hm.isEmpty());
        System.out.println("hm="+hm);

        System.out.println(hm.get(13));

        hm.remove(13);
        System.out.println("hm="+hm);

        System.out.println(hm.containsKey(13));
        System.out.println(hm.containsValue("Navanath"));

        hm.clear();
        System.out.println("hm="+hm);

    }
}
