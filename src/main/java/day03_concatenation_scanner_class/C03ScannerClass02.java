package day03_concatenation_scanner_class;

import java.util.Scanner;

public class C03ScannerClass02 {

    public static void main(String[] args) {
        //Ask full name of the user and print on the console
        //Create Scanner Class object

        Scanner input = new Scanner(System.in);

        //Write message to the use
        System.out.println("Please Enter Your Full Name: ... ");

        //Get data from user
        String fullName = input.nextLine();
        System.out.println("full Name is = " + fullName);

        //Ask user to enter parents first name only

        System.out.println("Please Enter Your Parent's First Name Only: ... ");

        String firstName = input.next(); // when you use next, it will take only first name even if you write both first and last

        System.out.println("first Name is = " + firstName);
    }

}
