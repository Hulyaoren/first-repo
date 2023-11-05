package day12_arrayLists;

import java.util.ArrayList;

public class C02ArrayLists01 {

    public static void main(String[] args) {

        //Array List is used to store multipele data with flexible length
        //we have to declare length when we create Arrays. This causes prob;ems insome occasions.
        //Java created a new structure to overcome this problem --> Array List
        //Arrays store primitive data and references but Array Lists store non-primitive data
        // Why Java did not remove Arrays: i) Arrays are faster ii) Arrays use memory less

        // How to create Array List:

        ArrayList<Integer> myList = new ArrayList<>();

        //How to print Array List on the console:
        System.out.println(myList);

        //How to add elements to Array List:

        myList.add(6);
        myList.add(3);
        myList.add(9); //add() methods add value to the end of the list

        myList.add(1,5);
        myList.add(3,7);

        System.out.println(myList);

        ArrayList<Integer> n = new ArrayList<>();
        n.add(99);
        n.add(88);
        n.add(77);
        System.out.println(n);

        myList.addAll(n);
        System.out.println(myList);

        myList.addAll(2,n);
        System.out.println(myList);

        //How to remove elements
        myList.remove(2);


        //How to get index of an element
        System.out.println("myList.indexOf(88) = " + myList.indexOf(88));

        //How to update an element
        myList.set(1,15);
        System.out.println(myList);

        //How to get an element
        System.out.println("myList.get(2) = " + myList.get(2));

        //Example: Create an Array List and change odd elements to 11

        ArrayList<Integer> m = new ArrayList<>();
        m.add(23);
        m.add(20);
        m.add(13);
        m.add(8);
        m.add(3);
        System.out.println(m);

        for (Integer w:m){

            if (w%2 !=0) {
                m.set(m.indexOf(w),11);
            }
        }
        System.out.println(m);

        //Example:2 Create a String ArrayList and remove elements that contains "a"

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("New York");
        cities.add("Tamba");
        cities.add("Virginia");

        System.out.println(cities);
//        for (String w: cities){    //we can't use for each loop if we add or remove an element from a list
//            if(w.contains("a")) {
//                cities.remove(w);
//            }
//        }

        for (int i=0; i<cities.size(); i++){
            if (cities.get(i).contains("a")){
                cities.remove(cities.get(i)); //cities.remove(i)
                i--;
            }
        }
        System.out.println(cities);



    }
}
