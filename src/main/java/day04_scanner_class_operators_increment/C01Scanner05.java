package day04_scanner_class_operators_increment;

import java.util.Scanner;

public class C01Scanner05 {

    public static void main(String[] args) {
        //Example 3: Ask user to enter i)Full name ii)Age iii)Height iv)Marital status
//           Then print them on the console in different lines with a label

        //First: create scanner class:
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your full name:..");
        String fullName = input.nextLine();

        System.out.println("Please enter your age:...");
        byte age = input.nextByte();

        System.out.println("Please enter your height:..");
        int height = input.nextInt();

        System.out.println("Please enter your marital status:...");
        String maritalStatus = input.next();

        System.out.println("Your fullName is = " + fullName);
        System.out.println("Your age is = " + age);
        System.out.println("Your height is = " + height);
        System.out.println("Your maritalStatus is = " + maritalStatus);


    }

}
