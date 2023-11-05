package day21_oopconcept05_static_keyword;

public class c07StudentRunner {
    public static void main(String[] args) {
        C06Student st1 = new C06Student();
        System.out.println("st1.numOfEyes = " + st1.numOfEyes);
        System.out.println("st1.numOfStudents = " + st1.numOfStudents);
        System.out.println("C06Student.numOfStudents = " + C06Student.numOfStudents);

        C06Student st2 = new C06Student();
        System.out.println("st2.numOfEyes = " + st2.numOfEyes);
        System.out.println("st2.numOfStudents = " + st2.numOfStudents);
        System.out.println("C06Student.numOfStudents = " + C06Student.numOfStudents);

        C06Student st3 = new C06Student();
        System.out.println("st3.numOfEyes = " + st3.numOfEyes);
        System.out.println("st3.numOfStudents = " + st3.numOfStudents);


    }

}
