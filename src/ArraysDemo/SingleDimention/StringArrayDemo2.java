package ArraysDemo.SingleDimention;

public class StringArrayDemo2 {

    public static void main(String[] args) {

        String[] stArr = {"Amol Ujagare","Vaishali Ujagare","Rachita","Automation Testing","AI Business Engine"};


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
