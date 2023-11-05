package day09_loops;

import java.util.Scanner;

public class C08DoWhile02 {

    public static void main(String[] args) {
        //find sum of integers from 7 to 10

        int x = 7;
       int sum = 0;

        do {
            sum +=x;
            x++;
        } while (x<11);
        System.out.println(sum);

        /*
        Ask user to enter an integer
        if less than 100 tell "won", otherwise "lost"
         */

        Scanner input = new Scanner(System.in);
        int k = 1;
        do {
            System.out.println("Please enter an integer");
            k = input.nextInt();
            if (k < 100) {
                System.out.println("Won");
            }
        }while (k<100);
        System.out.println("Lost");

    }
}
