package day04_scanner_class_operators_increment;
public class C04Operations {
    public static void main(String[] args) {
        // "=" Assignment operator: assigns value on the right to the value on the left
        // "==" Equality Operator: Compares right hand side with the left hand side
        //     3+5 == 8 ===> true     3 + 2 == 2 ===> false
        //    'A' == 65 ===> true
        // If we use chars together with math operations java uses their ASCII value
        System.out.println('A'==65);
        System.out.println("A"+"a");
        System.out.println('A'+'a');
        System.out.println("A"+'a');
        // Example: Find ASCII value of '!' by typing code
        System.out.println('*' + 0);
        System.out.println('!' * 1);
        // '!' Not Operator:  !true = false   !false = true   !!true = true
        // '!=' Not Equal :   3+4 != 1 ===> true  2+5 != 7 ===> false
        // '>', '<' , '>=' , '<='
        /*
        '==' with Strings
        For every String data there are two main parts: 1) value  2) address
        When we compare String values dont prefer to use '==' operator.
        To compare two Strings use String methods. (equals())
         */
        String s1 = "Tom";
        String s2 = "Hanks";
        String s3 = "Tom";
        String s4 = new String("Tom");
        System.out.println(s1==s2);// false
        System.out.println(s1==s3);// true
        System.out.println(s1==s4);// false
        System.out.println(s1.equals(s4));// true
        //System.out.println(s1.equalsIgnoreCase(s4));
    }
}
