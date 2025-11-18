package loops;

public class INCDec1 {
    public static void main(String[] args) {

        int a = 10;

        System.out.println(a); // 10
        System.out.println(a++); // 10
        System.out.println(a); // 11
        System.out.println(++a); // 12
        System.out.println(a); // 12

        /*a++ / a - - : First the statement is executed and
        then increment or decrement happens

        ++a /  - -a :  first increment or decrement happen and
        then the statement is executed
        */
    }
}
