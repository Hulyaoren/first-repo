package practice_dt;

import java.util.Scanner;

public class sloane {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Please Enter First Name and Last name = ");


        String fullName = input.nextLine();

        char firstChar = fullName.charAt(0); // T

        fullName.split(" ")[1].charAt(0);
        char lastnameFirstChar= fullName.split(" ")[1].charAt(0);
        System.out.println(firstChar + " " + lastnameFirstChar);

    }
}
