package day06_switch_ternary_stringmanipulations;

import java.util.Scanner;

public class C03TernaryOperators01 {
    //Type a code to check if the number is even or odd

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 =12;

       String result1 = (num1%2==0) ? "Even":"Odd";
        System.out.println(result1);

        //Example 2: Write a code to check if given number has 3 digits or not

        System.out.println("Please enter a number to see if it has 3 digits");

        int number = input.nextInt();
        String result2 = ((number<1000 && number>99)||(number>-1000 && number<-99) ? number + "has three digits" : number + "has not three digits");
        System.out.println(result2);

//Example:3 Write a code to calculate absolute value of a number
      int num3 = -23;
      int result3 = (num3<0) ? -1*num3 : num3;
        System.out.println(result3);

//Example 4: Type code to find the multiplication of two integers if the signs are same.
//           Give a message like "I do not know how to multiply" if the signs are different.
//           5 and 4 ==> 5*4    -3 and -2 ==> -3*-2    -4 and 3 ==> "I do not know how to multiply"

    int a = 9;
    int b = 6;
    Object result4 =    (a<0 && b<0) || (a>0 && b>0) ? a*b : "I don't know how to multiply";
        System.out.println(result4);


    }

}
