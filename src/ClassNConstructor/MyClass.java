package ClassNConstructor;

public class MyClass {

    int a;
    double d;
    char c;
    String str; // Data members

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


        int x;

        x = 10 ;

        MyClass ob = new MyClass();
        ob.a = 10 ;
        ob.d = 10.33 ;
        ob.c = 'a' ;
        ob.str = "Text 1" ;
        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 11 ;
        ob2.d = 11.33 ;
        ob2.c = 'b' ;
        ob2.str = "Text 2" ;
        ob2.display();
    }



}
