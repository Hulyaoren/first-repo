package day18_oopconcept02;
/*
  How constructors work in inheritance
  1) Java uses "Constructors" from parents Classes to inherent child
    because without having parent we cannot create child
2) Every Const has invisible "super()" key word in the first line. If you
    want you can make it visible
3) super() keyword is for calling parent const with given parameters
        (you can write parameters inside super() to decide which constr to work)
4) "this()" keyword is used for calling const in the same class
5) Using "super()" and "this" keyword in object creation provides flexibility
6)We can create an object which has a data type of parent class.
7) If you have a variable with the same name in inheritance,
    the value of variable will be selected according to Class used as data type
8)If we use methods with same name in inheritance,
    the method will be selected from the class that const is created
9)"super" is used to call "variables" or "methods"  in the parent class
    "this" is used to call "variables" or "methods"  in the same class
   */
public class C01Animal {
  public String name;
  public int age;
  public boolean isPet;
  public int weight = 12;

  public void eat() {
      System.out.println("Animals eat..");
  }

    public C01Animal() {
        this("Arlo",4,true);
        System.out.println("A No Parameters");
    }

    public C01Animal(String name, int age) {
        this();
        System.out.println("String name, int age Parameters");
        this.name = name;
        this.age = age;
    }

    public C01Animal(String name, int age, boolean isPet) {
        super();
        System.out.println("String name, int age, boolean isPet Parameters ");
        this.name = name;
        this.age = age;
        this.isPet = isPet;
    }
}
