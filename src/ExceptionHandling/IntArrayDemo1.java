package ExceptionHandling;

public class IntArrayDemo1 {

    public static void main(String[] args) {

        int[] a = new int[5];

        try {
            a[0] = 23;
            a[1] = 13;
            a[2] = 26;
            a[3] = 53;
            a[4] = 29;
            a[5] = 29;
        }
        catch (Exception e)
        {
            System.out.println("inside catch");

            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();

        }


        System.out.println("Below is the array");

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }


    }
}
