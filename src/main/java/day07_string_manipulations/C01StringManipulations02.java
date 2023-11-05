package day07_string_manipulations;

public class C01StringManipulations02 {
    //Example 1: Make the all digits except last 4 digits of a credit card invisible by using '*'
//           1234 1234 1234 1234 ==> **** **** **** 1234
    public static void main(String[] args) {

        String ccNum = "1234 1234 1234 1234";
        String ccNum1 = ccNum.substring(0,15).replaceAll("[0-9]","*");
        String ccNum2 = ccNum.substring(15);

        String hiddenCcNum = ccNum1 + ccNum2;
        String hiddenCcNum2 = ccNum1.concat(ccNum2);

        System.out.println("hiddenCcNum = " + hiddenCcNum);
        System.out.println("hiddenCcNum2 = " + hiddenCcNum2);

        //Example 2: Count the number of characters different from space were used in a String
//          "Tom Hanks was born in 1975."

        String s1 = "Tom Hanks was born in 1975.";
        int numOfChars = s1.replace(" ", "").length();
        System.out.println(numOfChars);

        //concat() : it concatenate strings
        // replace(char, char) or replace(String, String) is used to change single char or sequence of char
        // replaceAll() is used when we need to use regex

    }
}
