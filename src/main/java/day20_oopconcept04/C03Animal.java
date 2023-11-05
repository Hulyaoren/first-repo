package day20_oopconcept04;
/*
    1) Concrete Method: Method with body
       Abstract Method: Method without body
    2) To make a method abstract:
        i) remove method body
        ii) add "abstract" keyword between access modifier and return type
        iii) add "abstract" keyword before class keyword
    3) If a method made abstract, all concrete child classes must override it
       An abstract class can have concrete methods. Child classes does not have to override them
    4) Java does not allow us to create objects from Abstract classes
       "Abstract classes" have some methods without body. This makes object has some
       problems, missing method body. If a method is not complete
       it can not perform some operations?
     5)  Abstract methods does not have to be overridden in abstract child classes
        Abstract methods  have to be overridden in concrete child classes
     6) If an abstract method is overridden by a concrete child class, it is not mandatory
      child classes of concrete class to override
     7) "Abstarct classes" can have both abstract and concrete methods
     but "concrete classes" can have only concrate methods
     8) "Abstract methods" can have "public", "protected" and "default" access modifiers,
     can not have "private" access modifier
     9) "Final Method": Final means you can not update it.
        Can we declare abstract method as fina?
        -No, because final methods can not be updated
        Can we override to final method
        -No
     10) Can we make an "abstract method" static(same data for all)?
        -No,



 */
public abstract class C03Animal {
    public abstract void eat();

    public void drink(){
        System.out.println("Animals drink..");
    }
}
