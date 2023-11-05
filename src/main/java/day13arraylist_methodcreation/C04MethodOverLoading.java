package day13arraylist_methodcreation;

public class C04MethodOverLoading {
    public static void main(String[] args) {

    }

    //Create a method to add two integers
    public  static int add(int a, int b){
        return a+b;
    }
    //Create a method to add three integers

    public static int add(int a, int b, int c){
        return a+b+c;
    }
    //create a method to add one integer and double

    public static double add(int a, double b){
        return a+b;
    }
    //create a method to add one doeble and one integer

    public static double add (double a, double b){
        return a +b;
    }
    //Method overloading: using same name with different parameters in a class
    //parameters can be made different by three ways;
    //      i) different number of parameters
    //      ii) different data types
    //      iii) order of parameters if they have different data types
    //Method signature: method name + parameters
    //static and non-static methods can be overloaded
    //Access modifier, static keyword and return types cannot make methods different and can be used in method overloading
    //Java is OOP language. Ith has four principles:
    //                      i) Inheritance
    //                      ii) Polymorphism = method overloading + method overwriting
    //                      iii) Encapsulation
    //                      iv) Abstraction

}
