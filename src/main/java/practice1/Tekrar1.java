package practice1;

import java.time.LocalDate;
import java.util.Scanner;

public class Tekrar1 {
    public static void main(String[] args) {
        //the largest power of 2 less than or equal to n

        System.out.println(powOfTwo(32));

       //compute a finite sum
        System.out.println("finiteSum(5) = " + finiteSum(5));

       //compute a finite product
        System.out.println("finiteProduct(5) = " + finiteProduct(5));

        //print table of function values

       //calculate age
        Scanner input = new Scanner(System.in);
        System.out.println("Enter date of birth to calculate age");
        int dob = input.nextInt();
        int age = calculateAge(dob);
        System.out.println(age);


//      int power = 1;
//      int n = 20;
//       while (power <= n / 2) {
//           power = 2 * power;
//       }
//        System.out.println(power);

  }

   public static int powOfTwo (int n) {
       int power = 1;
       while (power <= n / 2) {
           power = 2 * power;

       }
       return power;

   }

   public static int finiteSum(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum = sum+i;
        }
        return sum;
   }

   public static int finiteProduct(int n){
        int product = 1;

        for (int i=1; i<=n; i++){
            product = product*i;
        }
        return product;
   }

    public static int calculateAge(int dateOfBirth){
        return LocalDate.now().getYear() - dateOfBirth;
    }



}
