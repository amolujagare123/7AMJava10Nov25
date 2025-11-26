package ClassNConstructor.pack1;

public class Java1 {

    public int a;
    private double d;
    char c;
    String str;  // default // Data members

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {



        Java1 ob = new Java1();
        ob.a = 10 ;
        ob.d = 10.33 ;
        ob.c = 'a' ;
        ob.str = "Text 1" ;
        ob.display();


    }



}
