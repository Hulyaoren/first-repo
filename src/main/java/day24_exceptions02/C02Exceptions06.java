package day24_exceptions02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02Exceptions06 {
    /*
    "throw" key word is used to throw an Exception, "throws" keyword is used to handle an Exception.
    "throw" is used in method body, "throws" keyword is added to method signature
    "throw" can be used several time in metd body, "throws" keyword is used only one
    after "throw" we create Exception object, after "throws" we add Class name
    after "throw" a single constructor can be used, after "throws" several Classnames can be used.
     */

    public static void main(String[] args) throws IOException {
        printAge(23);
        readAndPrintFile();

        //printAge(-23);

    }

    //Create a code that prints given age
    public static void printAge(int age) {
        if (age >= 0) {
            System.out.println(age);
        } else{
            throw new IllegalArgumentException("Age can not be less than zero..");
    }
    }

    //Create a method that will read a text file.
    public static void readAndPrintFile() throws IOException {
        // Way to reach a file
        FileInputStream fis = new FileInputStream(("src/main/java/day24_exceptions02/MyFile.txt"));
// way to read a File:
        int k=0;
        while ((k=fis.read())!= -1){
            System.out.print((char) k);
        }

    }


}

