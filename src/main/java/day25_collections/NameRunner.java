package day25_collections;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class NameRunner {

    public static void main(String[] args) throws IllegalNameException {
        List<String> names = new ArrayList<>();
        addName(names,"George");
        addName(names,"Andy");
        addName(names,"4Andy");
        System.out.println(names);

    }

    //Create a method that adds given name to a class list
    public static void addName(List<String > list, String name) throws IllegalNameException {
        char initial = name.charAt(0);
        if(initial>64 && initial<123) {
            //if (inital > 'A' && intial < 'z')
            list.add(name);
        } else {
            throw new IllegalNameException("Name must start with letters");
        }
    }
}
