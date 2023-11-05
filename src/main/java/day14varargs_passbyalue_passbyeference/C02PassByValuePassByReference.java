package day14varargs_passbyalue_passbyeference;

public class C02PassByValuePassByReference {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int r1= add(a,b);
        System.out.println("in the main 'original' ---->" + a);
        System.out.println("r1 = " + r1);
    }
    public static int add(int a, int b){
        a= a+2;
        System.out.println("in the method----->" + a);
        return a+b;
    }
}