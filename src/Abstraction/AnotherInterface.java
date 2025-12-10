package Abstraction;

public interface AnotherInterface {
    void run(); // declaration
    void start();
    void display();
}

interface Interface2
{
    void display();
}

class ChildInterface2 implements AnotherInterface,Interface2
{
    public void run() // definition of method
    {
        System.out.println("run");
    }
    public void start()
    {
        System.out.println("start");
    }

    public void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {

        AnotherInterface ob = new ChildInterface2();
        ob.run();
        ob.start();
        ob.display();

        Interface2 ob2 = new ChildInterface2();
        ob2.display();


    }



}
