package practice_dt;

import java.util.Scanner;

public class Practice06_ScannerClass_GettingInitials {

    public static void main(String[] args) {
        //Example: Ask user to enter his name and get the initial of a name which contains first name and last name
        //         Tom Hanks ==> TH

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name and last name....");

        String fullName = input.nextLine();

        char firstChar = fullName.charAt(0);

        char firstCharOfLastName = fullName.split( " ")[1].charAt(0);

        System.out.println(firstChar+ " " + firstCharOfLastName);

    }
}
