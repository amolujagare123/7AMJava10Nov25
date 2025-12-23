package WrapperClass;

public class WrapperClassDemo {

    public static void main(String[] args) {

        int i = 5;
        System.out.println("i="+i);

        Integer ii1 = i;
        Integer ii2 = 15;// auto boxing / auto wrapping

        System.out.println("ii1="+ii1);
        System.out.println("ii2="+ii2);

        int k1 = ii2.intValue(); //unboxing /unwrapping
        int k2 = ii2; // auto unboxing / auto unwrapping
        System.out.println("k1="+k1);
        System.out.println("k2="+k2);





    }
}
