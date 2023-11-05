package day07_string_manipulations;

public class C05FindMiddleIndex {
    public static void main(String[] args) {
       // String word = "amanda";
       // String middle = "";

       // System.out.println("word.split() = " + word.split("a"));

        String name ="0a234567addddd";

        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('a', name.indexOf('a')+1));



    }
}
