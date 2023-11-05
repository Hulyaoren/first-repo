package day20_oopconcept04;
/*
    All methods in interfaces are "public" and "abstract" therefore you don't need to use these keywords
    in method declaration.
    1)  Interfaces have "Abstract Methods" ,which means uncompleted methods.
        Therefore, Java will not let us to create an Object from interface
    2) "Abstract classes" are just classes and they have constructors. But Java does not
        allow "Abstract classes to create object.
        Interfaces don't have constructors and they have different structure from classes.
        We cannot create object from Interfeces
    3   All methods in Interface must be overriden by concrete child classes. This is why
        "interfaces" are called as "To-Do List"
*/
public interface C10Engine {
    void start();
    void stop();
    // Static Concrete method:
    static void accelerate(){
        System.out.println("Increase speed so fast...");
    }
    // Default concrete methods:
    default void price(){
        System.out.println("Every Engine has a price...");
    }
    /* Variables in Interface:      All variables in interfaces are "final"
                                        i) We have to initialize first
                                        ii) We can not change them later
                                        iii) For naming convention it should be all in capitals
                                    All variables in interfaces are "public" ,"final"
     */

    public final static String ENGINE_NAME = "Electrical Engine";
}