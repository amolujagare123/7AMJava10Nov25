package ArraysDemo.SingleDimention;

public class DoubleArrayDemo1 {

    public static void main(String[] args) {

        double[] a = new double[5];

        a[0] = 23.34;
        a[1] = 13.34;
        a[2] = 26.34;
        a[3] = 53.34;
        a[4] = 29.34;

     //   int l = a.length; //

        System.out.println(a.length);

        System.out.println("Below is the array");

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("Below is the array using for each loop..");

        for(double x : a)
        {
            System.out.println(x);
        }

    }
}
