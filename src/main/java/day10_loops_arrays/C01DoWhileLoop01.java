package day10_loops_arrays;

import java.util.Scanner;

public class C01DoWhileLoop01 {

    public static void main(String[] args) {
        do {


            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter a number..");
            int num = input.nextInt();

            if (num >= 100) {
                System.out.println("You lost");
                break;
            }
            System.out.println("You won!");
        } while(true);

    }

}
