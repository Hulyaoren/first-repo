package day06_switch_ternary_stringmanipulations;

import java.util.Scanner;

public class C01SwitchStatement01 {

    public static void main(String[] args) {
        // Example: 1 Type code that gives you name of the day after you give number of the day
        // 2 ----> "Monday"   1----> "Sunday"

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number to see the day");

        byte number = input.nextByte();

        if(number == 1 ) {
            System.out.println("The day is:Sunday");
        } else if(number == 2){
            System.out.println("The day is:Monday");
        }else if(number == 3){
            System.out.println("The day is:Tuesday");
        }else if(number == 4){
            System.out.println("The day is:Wednesday");
        }else if (number == 5){
            System.out.println("The day is:Thursday");
        }else if (number == 6){
            System.out.println("The day is:Friday");
        }else if(number == 7) {
            System.out.println("The day is:Saturday");
        }else {
            System.out.println("Please choose a number between 1-7");
        }
        //Second way: Switch Statement

        switch (number) {
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thursday");
                break;
            case 6 :
                System.out.println("Friday");
                break;
            case 7 :
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Please enter a number between 1-7");
                break; // Last break is optional
        }


    }

}
