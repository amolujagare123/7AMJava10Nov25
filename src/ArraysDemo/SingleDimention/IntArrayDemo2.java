package ArraysDemo.SingleDimention;

public class IntArrayDemo2 {

    public static void main(String[] args) {

        int[] a = {23,56,77,88,99,123,13,45};



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
