package ClassNConstructor;

public class MyClassParam {

    int a;
    double d;
    char c;
    String str; // Data members

    MyClassParam(int a1,double d1,char c1 ,String str1)
    {
        a = a1;
        d = d1;
        c = c1;
        str = str1;
    }

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClassParam ob = new MyClassParam(12,34.56,'h',"amol");
        ob.display();
    }

}
