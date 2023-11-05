package day11_arrays;
import java.util.Arrays;
public class C03MultiDimensionalArrays {
    public static void main(String[] args) {
        // How to declare multidimensional Array:
        int[][] numbers = new int[3][2];
        // How to print mult. dim. Array on the console:
        System.out.println(Arrays.deepToString(numbers)); // [[0, 0], [0, 0], [0, 0]]
        // How to assign values:
        numbers[0][1] = 7;
        numbers[1][0] = 2;
        numbers[0][0] = 10;
        numbers[1][1] = 3;
        numbers[2][0] = 5;
        numbers[2][1] = 1;
        System.out.println(Arrays.deepToString(numbers));

        // Example: Type a code to find total number of elements in a multidimensional Array

        String [][] arr = {{"X","R"},{"Q"},{"k","m","a"}};
        int numOfElements = 0;

        for (String[] w: arr){
            numOfElements =numOfElements + w.length;
        }

        System.out.println(numOfElements);


//Example 2: Print the elements which has "a" in it from a multidimensional array

        String[][] brr = {{"Java", "is"}, {"easy"}, {"to", "learn"}};






    }
}
