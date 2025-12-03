package Methods;

public class MethodReturningValue {

    int methodName()
    {
        int a = 11;
        return a;
    }

    char returnChar()
    {
        int a = 97;
        char ch = (char) a;
        return ch;
    }

    String returnString()
    {
        String str = "This is  a nice place";
        return str;
    }

    public static void main(String[] args) {

        int y;

        y = 34;

        System.out.println(y) ;
        MethodReturningValue ob = new MethodReturningValue();

        int a1 = ob.methodName();
        System.out.println(ob.methodName());

    }

}
