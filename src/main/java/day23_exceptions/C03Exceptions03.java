package day23_exceptions;

public class C03Exceptions03 {
    public static void main(String[] args) {

        String[] str = {"Uranus","Hulya","Cagatay","Selim"};
        printArrayElement(str,1);
        printArrayElement(str,4);

        System.out.println((convertStringToInteger("125") + 1));
        System.out.println((convertStringToInteger("0") + 1));
        System.out.println((convertStringToInteger("-5") + 1));
        System.out.println((convertStringToInteger("12s5") + 1));


    }


    // Create a method that prints an Array element in a given index on the console
    public static void printArrayElement(String[] s,int idx){
        try {
            System.out.println(s[idx]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of bound");
        }
    }

//Create a method to convert given String to Integer

public static Integer convertStringToInteger(String str) {
        Integer result = 0;
        try {
            result = Integer.valueOf(str);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
            result = 0;

        }
        return result;
}



}
