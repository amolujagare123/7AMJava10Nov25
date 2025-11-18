package loops;

public class INCDec2 {
    public static void main(String[] args) {

        int a = 10;

        System.out.println(a); // 10
        System.out.println(a--); // 10
        System.out.println(a); // 9
        System.out.println(--a); // 8
        System.out.println(a); // 8

        /*a++ / a - - : First the statement is executed and
        then increment or decrement happens

        ++a /  - -a :  first increment or decrement happen and
        then the statement is executed
        */
    }
}
