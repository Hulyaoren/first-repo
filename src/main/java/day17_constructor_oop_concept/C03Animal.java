package day17_constructor_oop_concept;

public class C03Animal {
    /*
    1) We create parent - child relation to save common class members into parent class
            i) prevents repetition
            ii) makes maintenance easy
            iii)make updating easy
            iv)save time type codes
            v) makes classes as small as possible in size --> faster
   2) Access modifiers:  public and protected class members can be inherited without any restrictions by child classes
                           private class members cannot be inherited by child classes
                           default class members ca be inherited inside the same package by child classes
     3) If a child class uses a class member from a parent class ----> inheritance
     4) Object-Oriented-Programming Concept has 4- principle:
                i) Inheritance  ii) Polymorphism   iii) Encapsulation   iv) Abstraction
     5) There are different types of inheritance:
            i) Multiple Inheritance: Java does not support multiple inheritance
                                     Java support single inheritance
            ii) Multilevel inheritance: Java supports multilevel inheritance
            iii) Hierarchical inheritance: Combination of multilevel and single inheritance
     6) If two Classes has "IS-A" or "HAS-A" relationship we call them "Covariant" Data Types

     */

    public void eat(){
        System.out.println("Animals eat..");
    }
    public void drink(){
        System.out.println("Animals drink..");
    }
}
