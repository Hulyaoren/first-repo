package day05_logicaloperators_ifstatements;

import java.util.Scanner;

public class C07IfStatement05 {

    public static void main(String[] args) {

        //Nested If Statement
//Example 6:
//If a number is even then check if it is divisible by 3 or not.
//If it is divisible by 3 the output will be “Perfect even number” otherwise, the output will be “Good even number.”
//If the number is odd then check if it is divisible by 3 or not.
//If it is divisible by 3 the output will be “Perfect odd number” otherwise, the output will be “Good odd number.”

        Scanner input= new Scanner(System.in);

        System.out.println("Please enter a Number");
        int number =  input.nextInt();

        if(number%2==0){
            if(number%3==0){
                System.out.println("PErfect Even Number..");
            } else {
                System.out.println("Good Even Number..");
            }
        } else {
            //Try to avoid nested structure in java
            //They have time complexity---->it takes time
            if(number%3 == 0){
                System.out.println("Perfect odd number");
            } else {
                System.out.println("Good odd number");
            }
        }


    }

}
