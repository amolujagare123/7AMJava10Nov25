package InheritanceDemo;

public class AdditionOverloadingDemo {

    int a;
    int b;

    void add()
    {
        int c ;
        c = a + b;
        System.out.println("c="+c);
    }

    void add(int x)
    {
        int c ;
        c = x + b;
        System.out.println("c="+c);
    }

    void add(int x,int y)
    {
        int c ;
        c = x + y;
        System.out.println("c="+c);
    }

    void add(double x,double y)
    {
        double c ;
        c = x + y;
        System.out.println("c="+c);
    }

    void add(double x,double y,String str)
    {
        double c ;
        c = x + y;

        System.out.println("c="+(str+c));

        System.out.println(c);
    }




    public static void main(String[] args) {
        AdditionOverloadingDemo ob = new AdditionOverloadingDemo();
        ob.add();
        ob.add(23);
        ob.add(23,56);
        ob.add(22,44,"amol");



    }
}
