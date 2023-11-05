package practice_dt;

import java.util.Scanner;

public class Practice04_ScannerClass {

    public static void main(String[] args) {

        /*
    Ask user to enter the width, length and the height of a rectangular prism then find the volume.
    Volume = width * length * height
     */

        //1.step Create a scanner class object
        Scanner input= new Scanner(System.in);

        //2.Step: Give message to the user
        //3.Step: Create a proper data type container to receive the value from the user
        System.out.println("Enter width for calculation...");
        double width=input.nextDouble();

        System.out.println("Enter length for calculation...");
        double length=input.nextDouble();

        System.out.println("Enter height for calculation...");
        double height=input.nextDouble();

        //Volume = width*length*height

        System.out.println("Volume is: " + width*height*length);











    }

}
