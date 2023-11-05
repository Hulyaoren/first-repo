package day13arraylist_methodcreation;

public class C03MethodCreation {

    public static void main(String[] args) {

        //Method Call:
       int r1 =  add(3,7);
        System.out.println(r1);

        double r2 = multiplyThreenumbers(2.1, 3.5, 4.5);
        System.out.println(r2);

        String r3 = addStrings("ja", "va");
        System.out.println(r3);
    }
    //Type a method to add integers
    public static int add(int a , int b){
        int sum = a + b;
        return sum;

    }
    //Type a method to multiply three numbers:
    public static double multiplyThreenumbers(double a, double b, double c){
        return a*b*c;
    }

    //Type a method that joins two Strings:

    public static String addStrings(String a, String b){
        return a.concat(b);
    }
}
