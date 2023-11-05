package day13arraylist_methodcreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class C01ArrayList02 {

    public static void main(String[] args) {

        //Example: Create a charcter list which has repeated characters and remove duplicates
        // [J, a, v, a, a] ------> [J, a, v, c]

        ArrayList<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('c');

        System.out.println(a);

        ArrayList<Character> b = new ArrayList<>();

        for (Character w:a) {
            if (!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println(b);

 //Example 4: Find the closest 2 integers in the given list.
//           [20, 15, 14, 11, 19] ==> 14-15, 19-20

        ArrayList<Integer> c= new ArrayList<>();
        c.add(20);
        c.add(15);
        c.add(14);
        c.add(11);
        c.add(19);
        System.out.println(c); //[20, 15, 14, 11, 19]

        Collections.sort(c);  //Array lists are collections, you can not say Arrays.sort()
        System.out.println(c);

        //2nd step: find the difference
        int minDiff = c.get(1) - c.get(0);
        for (int i = 1; i< c.size(); i++){
            if(c.get(i) - c.get(i-1) < minDiff){
                minDiff = c.get(i) - c.get(i-1);
            }
        }
        System.out.println(minDiff);

        //last step: finf element that have minDiff among them

        for (int k = 1; k< c.size(); k++){
            if(c.get(k) - c.get(k-1) == minDiff){
                System.out.println(c.get(k-1) + "and" + c.get(k));
            }
        }





    }
}
