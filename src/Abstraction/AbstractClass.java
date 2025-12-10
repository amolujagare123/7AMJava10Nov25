package Abstraction;

public abstract class AbstractClass {

    abstract void run(); // declaration
    abstract void start();

    void display()
    {
        System.out.println("Display");
    }
}

class  ChildAbstract extends AbstractClass
{
    /*@Override
    void run() {

    }

    @Override
    void start() {

    }*/
   void run() // definition of method
    {
        System.out.println("run");
    }
    void start()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

        AbstractClass ob = new ChildAbstract();
        ob.start();
        ob.run();
    }
}
