package day09_loops;

public class C05WhileLoop02 {
    public static void main(String[] args) {
        //print even numbers from 15 to 5

        int i=15;
        while(i>4) {
            if(i%2==0){
                System.out.println(i + " ");
            }
            i--;
        }

        // Example: Type a code to check if a given number is Palindrome or not
        //  12321 ---> palindrome  12312-----> not palindrome


        int num = 12321;
        String numStr = String.valueOf(num);
        String reversed = "";

        int k= numStr.length()-1;
        while (k>=0){
            reversed += numStr.charAt(k);
            k--;
        }

        int reversedNum = Integer.valueOf(reversed);

        if ( num == reversedNum){
            System.out.println("Yes, the number is palindrome");
        } else {
            System.out.println("Not");
        }

    }

}
