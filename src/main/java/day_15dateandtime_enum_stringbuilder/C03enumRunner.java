package day_15dateandtime_enum_stringbuilder;

import java.util.Scanner;

public class C03enumRunner {
    public static void main(String[] args) {
        String capital = UsStates.MASSACHUSETTS.getCapital();
        System.out.println(capital);

        String abbreviation = UsStates.GEORGIA.getAbbreviation();
        System.out.println(abbreviation);

        //Example 1: Ask user to enter state name then give user capital city

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter State Name");
        String stateName = input.nextLine();

        switch (stateName){
            case "ALABAMA":
                System.out.println(UsStates.ALABAMA.getCapital());
                break;
            case "ALASKA":
                System.out.println(UsStates.ALASKA.getCapital());
                break;
            case "AMERICAN_SAMOA":
                System.out.println(UsStates.AMERICAN_SAMOA.getCapital());
                break;
            case "ARKANSAS":
                System.out.println(UsStates.ARKANSAS.getCapital());
                break;
            default:
                System.out.println("Wrong Input");
        }


    }

}
