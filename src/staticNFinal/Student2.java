package staticNFinal;

public class Student2 {
    public int rno;
    public String name;
    public static String college = "ITS";

   public void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public  void nonStaticMethod1()
    {
        System.out.println("nonStaticMethod1");
        System.out.println("myStaticMethod1");
        System.out.println("rno="+rno); // non-static -  allowed
        System.out.println("name="+name); // non-static -  allowed
        System.out.println("college="+college); // static - allowed
        myStaticMethod2(); // static - allowed
        nonStaticMethod1(); // non-static -  allowed
        display(); // non-static -  allowed
    }

    public static void myStaticMethod1()
    {
        System.out.println("myStaticMethod1");
        System.out.println("rno="+rno); // non-static - not allowed
        System.out.println("name="+name); // non-static - not allowed
        System.out.println("college="+college); // static - allowed
        myStaticMethod2(); // static - allowed
        nonStaticMethod1(); // non-static - not allowed
        display(); // non-static - not allowed

    }

    public static void myStaticMethod2()
    {
        System.out.println("myStaticMethod2");
    }



    public static void main(String[] args) {

        Student2 s1 = new Student2();

    }

}
