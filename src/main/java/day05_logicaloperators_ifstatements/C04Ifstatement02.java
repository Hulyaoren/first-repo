package day05_logicaloperators_ifstatements;

import java.util.Scanner;

public class C04Ifstatement02 {

    public static void main(String[] args) {

        // Example :3 Ask user to enter initial letter of a day , then print
        //          all possible days starting with that initial
        // 'M' ----> Monday    'T' ------> Tuesday and Thursday
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Initial letter of a day ....");
        char initial = input.next().charAt(0); // To get char from String we use input.next().charAt(0)

        // initial = Character.toLowerCase(initial)
        if(initial=='M' || initial == 'm'){
            System.out.println("Monday");
        }else if(initial=='T' || initial == 't'){
            System.out.println("Tuesday an Thursday");
        }else if(initial=='W' || initial == 'w'){
            System.out.println("Wednesday");
        }else if(initial=='F' || initial == 'f'){
            System.out.println("Friday");
        }else if(initial=='S' || initial == 's'){
            System.out.println("Saturday and Sunday");
        }else {
            System.out.println("Please Enter a valid initial...");
        }
    }
}