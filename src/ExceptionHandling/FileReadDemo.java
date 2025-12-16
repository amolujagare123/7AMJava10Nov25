package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReadDemo {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("d:\\amol.txt1");
        System.out.println(" file read ");
    }
}
