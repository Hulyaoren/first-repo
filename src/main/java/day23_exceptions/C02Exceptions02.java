package day23_exceptions;

import java.util.Scanner;

public class C02Exceptions02 {
    /*
    Exceptions are strict rules inJava.
    They help developers not to do critical mistakes.
    for example you want to do division operation. you are not so good in Math.
    You think you can divide any two numbers. Indeed a number can not be divided by zero.
    In this case Java will "throw exception" and:
            i) explain the rule
            ii) stop execution of the code
     */
    public static void main(String[] args) {
        System.out.println("divide(12,4) = " + divide(12, 4)); //3
        System.out.println("divide(2,4) = " + divide(2, 4)); //0
        System.out.println("divide(0,8) = " + divide(8, 0));//ArithmeticException: Java throws ArithmeticException when there is a critical mistake in MAth operations

        System.out.println(divideNumbers(64, 0));
        System.out.println(getNumOfChars("Java"));
        System.out.println(getNumOfChars(""));
        System.out.println(getNumOfChars(null));


    }
    //First way to handle exception:
    public static int divide(int a, int b){
        if(b==0){
            return 0;
        }
        return a/b;
    }
 //Second Way: "try - catch" block

 public static  int divideNumbers(int a, int b)  {
        int result = 0;
        try{
            result = a/b;
            System.out.println("Hi"); // calismaz cunku exceptionu gorunce satiri atlayip catch'e gecer
        } catch (ArithmeticException e){
            result = 0;
        }
        return result;
 }

    // Create a method that will get the number of chars in a given String
 //First Way:
  public static int getNumOfChars (String str){
        if(str == null){
            return 0;
        }
        return str.length();

  }
  //Second Way:
    public static int numberOfChars(String str){
        int result = 0;
        try {
            str.length();
        }catch (NullPointerException e){
            result = 0;
        }
        return result;
    }

}
