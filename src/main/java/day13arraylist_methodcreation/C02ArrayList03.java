package day13arraylist_methodcreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02ArrayList03 {

    public static void main(String[] args) {
        //INTERVIEW QUESTIONS
        //From a given list find all pairs whose sum is a given number
    //{4, 6, 5, -10, 8, 5, 20} ==> 10
    //For example;  4+6=10, 5+5=10, -10+20=10

        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(6);
        a.add(5);
        a.add(-10);
        a.add(8);
        a.add(5);
        a.add(20);

        for (int i=0; i<a.size(); i++) {
            for (int j=i+1; j<a.size(); j++){
                if(a.get(i) + a.get(j) == 10){
                    System.out.println(a.get(i) + " + " + a.get(j));
                }

            }
        }
//Short format to create ArrayList:
//We can create a ArrayList by using Array.asList() method:

        List<Integer>  d = Arrays.asList(4,6,5,-10,6) ;
        System.out.println(d);
//d.add(3);
//d.remove(2);
//d.clear();   ---> those methods can not be apllied because it is an array seems like list

    }
}
