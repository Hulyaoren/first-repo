package day03_concatenation_scanner_class;

public class C01Concatenation {

    public static void main(String[] args) {

        //Concatenation: It is process of adding String or String with other data types
        //               Its symbol is "+"

        String name = "Tom";
        String lastName = "Hanks";
        String fullName = name + " " + lastName;
        System.out.println("fullName = " + fullName);
        System.out.println("Tom" + "Hanks"); // TomHanks
        System.out.println("Tom " + "Hanks "); // TomHanks
        System.out.println("Tom " + "Hanks "); // TomHanks

        System.out.println("Tom" + 4 + 9); //Tom49 left to right
        System.out.println(4+9+"Tom"); //13Tom
        System.out.println("Tom" + (4+9)); //Tom13
        System.out.println("Tom"+3*5); //Tom15 because * has priority
        System.out.println(3+5*2 + "Tom" + 4+2); // 13Tom42



    }

}
