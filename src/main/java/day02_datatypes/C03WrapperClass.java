package day02_datatypes;

public class C03WrapperClass {


    public static void main(String[] args) {
        // Wrapper Class: Java created a new data structure by adding some useful methods to primitive data types
         //                This new structure called as "wrapper class"
        //Java created wrapper class for every primitive data

        /*
        Primitive                         Wrapper Class
        byte       -------->                Byte
        short      -------->                Short
        int        -------->                Intger
        long       -------->                Long
        float      -------->                Float
        double     -------->                Double
        boolean    -------->                Boolean
        char       -------->                Character

         */
        //primitive data does not have methods

        int weight = 25;

        //Wrapper class has useful methods

        Integer height = 120;

//We can find max or min value of int by using Wrapper Class methods
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

//We can find max or min value of short data type by using Wrapper Class methods
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);

 //Auto Boxing: Converting primitive data to Wrapper Class (Automatically)

        char chr = '?';
        Character chr2 = chr;

// Unboxing:converting wrapper class data to primitive data (Automatically)

        Boolean b1 = true;
       // String str = b1.toString();   // "true"
        //System.out.println("b1.equals(false) = " + b1.equals(true));

      boolean b2 = b1;
      b1.booleanValue();

//--------------------------Examples---------------------------

    Double num = 43.5;
    short fromDouble = num.shortValue();  // 43
    String strFromDouble = num.toString(); // "43.5"
        System.out.println("strFromDouble = " + strFromDouble);
        System.out.println(num / 5);

    String str1 = "99.5";
    double fromString = Double.valueOf(str1);
        System.out.println("fromString = " + fromString);

        String str2 = "99";
        int frmStringToInt = Integer.valueOf(str2);




    }

}
