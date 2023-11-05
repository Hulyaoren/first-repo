package day21_oopconcept05_static_keyword;
/*
    Child      -     Parent
    class            class  ----> we use "extends"
    class            interface ----> we use "implements"
    interface        interface -----> we use "extends"
    interface        class  ----> It is impossible for interface to inherent from class

    *** What is the difference between abstract class and interface?
        i) Methods: "Abstract class" can use "concrete" and " abstract" methods
                    "Interface" can use only "abstract" methods
                        Note: By using "static" or "default" keywords we can create concrete mtds in interface
                              "static" : we can call them by name of the interface
                              "Default": we need to create an object to call them
                    All methods in interface are public, but in abstract class they can be "public", "protected"
                    or "default".
          ii) Variables: Access Modifier of variable in Interface public, but in Abstract Class it can have any access modifier.
          iii) Java does not support multiple inheritance. If we need to use multiple inheritance we use interface.

          iv)
 */

public interface C01Animals extends C00Creatures  {
int eat();
}
