package day06_switch_ternary_stringmanipulations;

public class C05StringManipulations {

    public static void main(String[] args) {
        //Example:1 Count the alphabetical chars in a given string
        //"Tom12 Hanks!..." ----->8

        /*
        ------------- Regular Expressions ------------
        i) If we handle group of data we use regex
        - All Uppercase letters:[A-Z]
        -All Lowercase letters: [a-z]
        -All letters           : [ A-Za-z]
        -All digits            : [0-9]
        -letters from b to m   : [b-m]
        -group of letters      : [akmer]

        -All chars except Uppercase letters: [^A-Z]
        -All chars except lowecase letters: [^a-z]
        -All chars except  letters: [^A-Za-z0-9]
        -All chars except  digits: [^0-9]
        -All chars except  digits: [^0-9]
        -All chars except  letters and digits: [^A-Za-z0-9]

        -All punctuation marks : \\p{Punct}

        */

        String name = "Tom12 Hanks!...";
        System.out.println(name.replaceAll("[^A-Za-z]", "").length());


        //Example:2 Write a code to change all numbers by * in a given password
        String password = "a126d?q5";
        String hiddenPass = password.replaceAll("[0-9]","*");
        System.out.println(hiddenPass);

        //Example:3 Get initials from full name:
        //"Tom Hanks" ---> TM  "tOM Hanks" --->TH

        //How to get first initial
        String name2 = "tOm hAnKs";
        String firstInitial = name2.substring(0, 1).toUpperCase();

        //How to get second initial
        String secondInitial = name2.split(" ")[1].substring(0,1).toUpperCase();
        System.out.println(firstInitial + secondInitial);

    }

}
