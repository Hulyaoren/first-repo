package day11_arrays;

import java.util.Arrays;

public class C01Arrays02 {

    public static void main(String[] args) {

       //Ex: find difference between max and min value of array
        // [8,12,34,10,78,19]
        int a = 69;
        int b = 41;

        int max = Math.max(a,b);
        int min = Math.min(a,b);


        int [] arr = {8,12,34,10,78,19};

        int maximum = arr[0];
        int minimum = arr[0];

        for (int w:arr) {
            maximum = Math.max(maximum, w);
            minimum = Math.min(minimum,w);
        }
        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(maximum-minimum);

        //Example 3: Create a String Array, add 5 elements in it, find the sum of the number of characters in all Strings
//Homework:
        String [] cities = {"London", "New York", "Dares Salaam", "Istanbul", "Athens"};

        int numChar = 0;

        for (String w:cities){
           numChar = numChar + w.length();

        }
        System.out.println(numChar);

        //Note: 1 Arrays can contain only "primitive data types" and "references"

        //Note: 2 String uses length() method, Array uses length variable
        //Example 4: [0, 2, 3, 0, 12, 0] put the zeros to the end ==> [2, 3, 12, 0, 0, 0]
        //Famous interview question
        int [] crr ={0, 2, 3, 0, 12, 0};
        int [] newCrr = new int[crr.length];
        int idx = 0;

        for (int w: crr){
            if(w!=0) {
                newCrr[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newCrr));
    }


}
