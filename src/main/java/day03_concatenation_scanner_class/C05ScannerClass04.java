package day03_concatenation_scanner_class;

import java.util.Scanner;

public class C05ScannerClass04 {
    //Example 2: Ask user to enter the width and the length of a rectangle, then print the area and perimeter

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the width and the length of rectangle: ");

        double width = input.nextDouble();
        double length = input.nextDouble();

        double area = width*length;
        double perimeter = 2*(width+length);

        System.out.println("Area of rectangle is: " + area);
        System.out.println("Perimeter of rectangle is: " + perimeter);





    }

}
