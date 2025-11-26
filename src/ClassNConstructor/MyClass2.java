package ClassNConstructor;

public class MyClass2 {

    int a;
    double d;
    char c;
    String str; // Data members

    MyClass2()
    {
        a = 88;
        d = 88.88;
        c = 'e';
        str = "amol";
    }

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {
        MyClass2 ob = new MyClass2();
        ob.display();
    }

}
