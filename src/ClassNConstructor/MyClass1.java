package ClassNConstructor;

public class MyClass1 {

    int a;
    double d;
    char c;
    String str; // Data members

    MyClass1()
    {
        // Empty
    }

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {
        MyClass1 ob = new MyClass1();
        ob.display();
    }

}
