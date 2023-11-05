package day09_loops;

public class C03ForLoops06 {

    public static void main(String[] args) {
        //Example 10: Find the sum of the digits of decimal part in a double number
        //  28.587 ==> 5+8+7=20

        double num = 28.587;
        //convert double to string to use methods
        String numStr = String.valueOf(num);

        //use split() method
        String decimalStr = numStr.split("[.]")[1];
        System.out.println(decimalStr);

        //convert string to int (cevirmezsek i=decimalStr yazamayiz)
        int decimal = Integer.valueOf(decimalStr);
        int sum = 0;
        for (int i=decimal; i>0; i/=10){
            sum = sum + i%10;
        }
        System.out.println(sum);

    }

}
