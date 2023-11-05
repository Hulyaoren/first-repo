package day21_oopconcept05_static_keyword;

public class C06Student {
    /*
        What is the difference between "static" and "non-static" keywords
            i) static class members are common for all object,
            non-static class members are shared only by the object itself.
            ii) When we make updates on "Static class" members the update will affect all objects
                When we make updates on non-static class members the update will affect only the specific object
                If we want other object to be informed we need to type code

             iii) To access "static" members we need only class name.
                  To access "non-static" members we need to create object

             iV) "Static" class members are created together with class.
                  "Non-static" class memebers are created while we are creating an object

              v) "static" class members are created once. "Non-static" class members are created in every object
     */

    public static int numOfStudents = 0;
    public int numOfEyes = 0;

    public C06Student() {
        this.numOfEyes = numOfEyes +2 ;
        numOfStudents++;
    }
}
