package day19_oopconcept03;
/*
    1) To have specific implementations in the child class we use "Method Overriding"
    2) In Method overriding we change the method body
       In method overriding we  we do not change method name and method parameters
     Method name and method parameters are "Method Signatures."
     ---> do not change method signature
     3) In "Method overriding" if the method has "void" return type, don't change it
         In "Method overriding" if the method has "primitive" return type, don't touch it
         In "Method overriding" if the method has "covariant"(parent-child relation) return type,
         you can change them
     4) The method in the child class is "Overriding Method"
         The method in the parent class is "Overridden Method"
         Access modifiers:

Overridden Method----->public
Overriding Method----->public

Overridden Method----->protected
Overriding Method----->protected or public

Overridden Method----->default
Overriding Method----->default, protected, public

Overridden Method----->private
Overriding Method----->private methods can not be overridden

    5)  Polymorphism = Method Overriding( Dynamic Polymorphism) + Method Overloading(Static Polymorphism)
    6)  What is the difference between "Method Overriding" and "Method Overloading" ?
        i)  "Method Overloading" occurs in a single class but for "Method Overriding" you need more than one classes
        ii) "Method Overriding" uses inheritance "Method Overloading" does not
        iii)  "private access modifiers can be overloaded but cannot be overridden
        iv) In "Method Overloading" we can change method signature but in "Method Overriding" we cannot change metd. sign.
        v) In "Method Overriding" access modifiers and return types have some rules but "Method Overloading" they don't play a role
        vi) "Method Overloading" we change parameters of method to work for different scenarios
            "Method Overriding" we change method body to make method implementations more specific
        vii) "static methods" can be overloaded but cannot be overridden


 */

public class C01Animal {
    public void eat(){
        System.out.println("Animals eat....");
    }

    public void drink() {
        System.out.println("Animal drinks..");
    }

    public int getWeight(){
        return 30;
    }

    public C01Animal create(){
     //   C01Animal myAnimal = new C01Animal();
     //   return myAnimal;
        return new C01Animal();
    }
}
