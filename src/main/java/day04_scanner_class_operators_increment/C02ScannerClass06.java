package day04_scanner_class_operators_increment;

import java.util.Scanner;

public class C02ScannerClass06 {

    public static void main(String[] args) {
//Example 4: Ask user to enter 5 digit integer like 45678
//           Type code to print the sum of the first two and the last two numbers
//           45678 ==> 45 + 78 = 123
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 5 digit integer:..");
        int num = input.nextInt();

        int firstTwo = num/1000;
        int lastTwo = num%100; //modulus operator returns the remainder of division operation

        System.out.println("The sum of first two digits and last two digits of " + num + " is " +(firstTwo+lastTwo) );






    }

}
