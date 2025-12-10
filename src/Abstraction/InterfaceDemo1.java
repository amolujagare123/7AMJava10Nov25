package Abstraction;

public interface InterfaceDemo1 {

     void run(); // declaration
     void start();

     static void display1()
     {
         System.out.println("display 1");
     }

     default  void display2()
     {
        System.out.println("display 2");
    }

    private   void display3()
    {
        System.out.println("display 3");
    }

}

class ChildInterface implements InterfaceDemo1
{
    public void run() // definition of method
    {
        System.out.println("run");
    }
    public void start()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

        InterfaceDemo1 ob = new ChildInterface();
        ob.run();
        ob.start();

        // WebDriver driver = new ChromeDriver();
    }
}
