package StringDemo;

public class StringComparison {

    public static void main(String[] args) {

        int a = 10;
        int b = 10;

      //  System.out.println(a==b);

        String s1 = "amol";
        String s2 = "amol";
        String s3 = "AMOL";
        String s4 = "Rahul";
        String s5 = new String("amol");

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
        System.out.println(s1.equalsIgnoreCase(s3)); // true
        System.out.println(s1.equalsIgnoreCase(s4)); // false
        System.out.println(s1.equals(s5));//true

        System.out.println(s1==s2);
        System.out.println(s1==s4);
        System.out.println(s1==s5);
    }
}
