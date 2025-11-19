package ArraysDemo.SingleDimention;

public class CharArrayDemo1 {

    public static void main(String[] args) {

        char[] a = new char[5];

        a[0] = 'j';
        a[1] = 'o';
        a[2] = '1';
        a[3] = '5';
        a[4] = '6';

     //   int l = a.length; //

        System.out.println(a.length);

        System.out.println("Below is the array");

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }


        System.out.println("Below is the array using for each loop..");

        for(char x : a)
        {
            System.out.println(x);
        }


    }
}
