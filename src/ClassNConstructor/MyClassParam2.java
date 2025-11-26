package ClassNConstructor;

public class MyClassParam2 {

    int a;
    double d;
    char c;
    String str; // Data members

    MyClassParam2(int a, double d, char c , String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {
      
        MyClassParam2 ob = new MyClassParam2(12,34.56,'h',"amol");
        ob.display();
    }

}
