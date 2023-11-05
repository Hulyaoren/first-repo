package day08_for_loop;

public class C04ForLoop03 {

    public static void main(String[] args) {
        //Example: 6 code to reverse a string (INTERVIEW QUESTION)
        //"Alexa"

        String str = "Alexa";

        for (int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();

        //second way
        String reversed = "";
        for (int i = str.length()-1; i>=0; i--){
            reversed = reversed + str.charAt(i) ;
            //System.out.println(reversed);
        }
        System.out.println("reversed = " + reversed);

        //example:7 find the sum of digits in an integer
        // 587 = 5+8+7

        int number = 55555;
        int sum = 0;

        for (int i=number; i>0; i/=10) {
            int digit = number % 10;
            number = number / 10;
            sum = sum + digit;
        }
        System.out.println("sum = " + sum);

        //Example: 8 Type code to find and print unique characters in a given String
        // "Hello"

        String str1 = "Hello";
        String unique = "";

        for (int x=0; x<str1.length(); x++) {
           for (int y=x+1; y<str1.length(); y++){
               if(str1.charAt(x) == str1.charAt(y)){

               }
           }
           unique = unique + str1.charAt(x);

        }
        System.out.println(unique);
    }
}
