package day11_arrays;

import java.util.Arrays;

public class C02Arrays03 {

    public static void main(String[] args) {
        //Example 5: Create an integer array and print all the elements less than 5
        //           [12, 3, -3, 5, 23] ==> 3, -3
        int[] nums = {12, 3, -3, 5, 23};
        for (int w: nums){
            if (w<5){
                System.out.print(w + " ");
            }
        }
        System.out.println();
        // Example Check if a specific element exists in an Array
        int[] numbers = {12, 3, 14, 5, 23};
        System.out.println(Arrays.binarySearch(numbers, 14)); // binarySearch() returns index of the element if it exists
        // before using binarySearch() you must sort the array
        // İf there are repeating elements you cannot use binarysearc()
        Arrays.sort(numbers);   // { 3, 5, 12, 14, 23}
        int idxOfElement =  Arrays.binarySearch(numbers,5);
        System.out.println(idxOfElement);
        // If Element does not exist in the Array binarySearch() return  "-3"  "-" means ----> does not exist
        // "3"    means -----> order if it would exist
    }
}