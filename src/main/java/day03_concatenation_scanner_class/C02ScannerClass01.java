package day03_concatenation_scanner_class;

import java.util.Scanner;

public class C02ScannerClass01 {

    public static void main(String[] args) {
        // Scanner Class: When we want to get input from user we use scanner class
        //To get data from user, we need to follow these 3 steps;
        //First Step: Create Scanner Class object
        Scanner input = new Scanner(System.in);

        //Write message to user
        System.out.println("Please Enter Your Age:....");

        //Get data from user
        byte age = input.nextByte();

        System.out.println("Your age is : " + age );
    }

}
