package loops;

import java.util.Scanner;

public class ArithMeticOperationSwitch {


    public static void main(String[] args) {

        int a = 0;
        int b = 0  ;
        int c = 0;
        String choice = "";

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Enter a = ");
            a = sc.nextInt();

            System.out.println("Enter b = ");
            b = sc.nextInt();


            String operation = "";


            System.out.println("Enter operation (add/div/sub/mult) = ");
            operation = sc.next();

            switch (operation) {
                case "add":
                    c = a + b;
                    System.out.println("Addition=" + c);
                    break;

                case "sub":
                    c = a - b;
                    System.out.println("Subtraction=" + c);
                    break;

                case "mult":
                    c = a * b;
                    System.out.println("Multiplication=" + c);
                    break;


                case "div":
                    c = a / b;
                    System.out.println("Division=" + c);
                    break;

            }

            System.out.println("Do you want to continue (y/n)");
            choice = sc.next();

        } while(!choice.equalsIgnoreCase("n"));
    }
}
