package Methods;

public class MethodsArguments {

    void method1()
    {
        System.out.println("method1");
    }

    void method2(int a)
    {
        System.out.println("method1 a="+a);
    }

    void method3(int a,int b,String str)
    {
        System.out.println("method3 a="+a);
        System.out.println("method3 b="+b);
        System.out.println("method3 str="+str);
    }

    void method4(int[] arr)
    {
        System.out.println("Printing array ....");
        for (int a:arr)
            System.out.print(a+"\t");

        System.out.println();

    }

    // Get all the words in from the given string into array

    String[] getAllWords(String myString)
    {
        String[] stArr = myString.split(" ");
        return stArr;
    }

    void method5(String[][] stArr)
    {
        System.out.println("Printing 2D array ....");
        for (int i=0;i< stArr.length ; i++)
        {
            for (int j=0 ; j <stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MethodsArguments ob = new MethodsArguments();
        ob.method1();
        ob.method2(34);
        ob.method3(23,45,"amol");

        int[] x = {12,34,56,78,99,11};
        ob.method4(x);

        String[][] st = {
                {"Amit", "Neha", "Rohan"},
                {"Priya", "Suresh", "Kavita"},
                {"Rahul", "Sneha", "Vivek"},
                {"Anita", "Manoj", "Pooja"}
        };

        ob.method5(st);

        String str = "This is a nice place";

        String[] words = ob.getAllWords(str);

        for (String word : words)
            System.out.println(word);
    }

}
