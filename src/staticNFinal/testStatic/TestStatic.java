package staticNFinal.testStatic;

import staticNFinal.Student2;
/*

import static  staticNFinal.Student2.myStaticMethod1;
import static staticNFinal.Student2.myStaticMethod2;
import static staticNFinal.Student2.college;
*/

import static staticNFinal.Student2.*;


public class TestStatic {

    public static void main(String[] args) {
        Student2 ob = new Student2();

        // static members accessed using object
        myStaticMethod1();
        myStaticMethod2();
        ob.college = "ITC";

        // static members accessed using className
        myStaticMethod1();
        myStaticMethod2();
        Student2.college = "ITC";

        //

        myStaticMethod1();
        myStaticMethod2();
        college = "ITC";

    }
}
