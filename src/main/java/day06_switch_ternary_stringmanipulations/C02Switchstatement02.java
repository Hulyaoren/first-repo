package day06_switch_ternary_stringmanipulations;

import java.util.Locale;
import java.util.Scanner;

public class C02Switchstatement02 {

    public static void main(String[] args) {
        // Example: 2 Ask user to enter name of a month then print month names starting from given
        // month till end of year
        //   October ------> October November December

        Scanner input = new Scanner(System.in);
/*
       System.out.println("Please enter write name of a month");
        String month = input.next().toLowerCase();

        switch (month) {
            case "January" :
                System.out.println("January");
            case "February" :
                System.out.println("February");
            case "March" :
                System.out.println("March");
            case "April" :
                System.out.println("April");
            case "May" :
                System.out.println("May");
            case "June" :
                System.out.println("June");
            case "July" :
                System.out.println("July");
            case "Agust" :
                System.out.println("Agust");
            case "September" :
                System.out.println("September");
            case "October" :
                System.out.println("October");
            case "November" :
                System.out.println("November");
            case "December" :
                System.out.println("December");
                break;
            default:
                System.out.println("Please enter a valid name");
         }
     }
 }

 */



        System.out.println("Please Enter Name of a Month...");
        String month = input.next().toLowerCase();
        switch (month){
            case "January" :
                System.out.println("January");
            case "February" :
                System.out.println("February");
            case "March" :
                System.out.println("March");
            case "April" :
                System.out.println("April");
            case "May" :
                System.out.println("May");
            case "June" :
                System.out.println("June");
            case "July" :
                System.out.println("July");
            case "August" :
                System.out.println("August");
            case "September" :
                System.out.println("September");
            case "October" :
                System.out.println("October");
            case "November" :
                System.out.println("November");
            case "December" :
                System.out.println("December");
                break;
            default:
                System.out.println("Please Enter a valid month name...");
        }
    }
}






