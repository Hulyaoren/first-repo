package day24_exceptions02;
/*
        If we use to add "throws" keyword to the method signature:
                Java will stop execution
        If we use try-catch clock Java handles problem in prescribed way and continue
        to execution of the codes
        FileNotFoundExcetion: Java throws FileNotFoundExcetion if the path is wrong ot
                              file is not there
         IOException: Java throws IOException for all issues related with input and output exception
         IOException is parent of FileNotFoundExcetion

 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01Exceptions05 {
    public static void main(String[] args) {
        readAndPrintFile();

    }

    //Create a method that will read a text file.
    public static void readAndPrintFile() {

        try {
            //Way to reach a file
            FileInputStream fis = new FileInputStream("src/main/java/day24_exceptions02/MyFile.txt");

            //Way to read a file:
            int k = 0;
            while ((k = fis.read()) != -1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The path is wrong or the file is deleted...");
        } catch (IOException e) {
            System.out.println("The file contains chars that hard to read..");
        }
    }

}
