package ArraysDemo.SingleDimention;

public class StringArrayDemo1 {

    public static void main(String[] args) {

        String[] stArr = new String[5];

        stArr[0] = "Amol Ujagare";
        stArr[1] = "Vaishali Ujagare";
        stArr[2] = "Rachita";
        stArr[3] = "Automation Testing";
        stArr[4] = "AI Business Engine";

     //   int l = a.length; //

        System.out.println(stArr.length);

        System.out.println("Below is the array");

        for(int i=0;i<stArr.length;i++)
        {
            System.out.println(stArr[i]);
        }

        System.out.println("Below is the array using for each loop..");

        for(String x : stArr)
        {
            System.out.println(x);
        }

    }
}
