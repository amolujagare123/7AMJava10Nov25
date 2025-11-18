package ArraysDemo;

public class IntArrayDemo1 {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 23;
        a[1] = 13;
        a[2] = 26;
        a[3] = 53;
        a[4] = 29;

     //   int l = a.length; //

        System.out.println(a.length);

        System.out.println("Below is the array");

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Below is the array using for each loop..");

        for(int x : a)
        {
            System.out.println(x);
        }

    }
}
