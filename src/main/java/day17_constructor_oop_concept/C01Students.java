package day17_constructor_oop_concept;
/*
    1)To create object we need Consturctor. Without const it is impossible to create an object
    2)When you create a class Java creates constructor automatically
    This invisible constructor is called as "default constructor"
    3)If we want we can create several constructor
    4) When we create a const we are not allowed to use default const anymore
    5) To create const with different parameters make your code flexible

        Question: What is the difference between method and constructor
            1) Methods
 */

public class C01Students {

    String name = "Tom Hanks";

    int age = 13;

    private  String stdId = "TM2010001";

    public void study(){
        System.out.println("Study hard...");
    }

    public void doSport(){
        System.out.println("Doing sports is good for health...");
    }
//How to create const manually
    public  C01Students(){

    }
    public  C01Students(String name,int age){

        this.name = name;
        this.age = age;
    }


    //How to create constructor with the help of Intellij


    public C01Students(String name, int age, String stdId) {
        this.name = name;
        this.age = age;
        this.stdId = stdId;
    }
}
