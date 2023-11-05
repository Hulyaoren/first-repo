package day08_for_loop;

public class C03ForLoop02 {

    public static void main(String[] args) {
        //Example: 3 Type code that prints even numbers between 6 and 17

        for(int i=6; i<18; i++ ){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("nnnnnn");

        //Example:4 print all numbers between 6 and 17 but not 13
       for(int i=6; i<18; i++) {
            if(i != 13){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //second way
        for(int i=6; i<18; i++) {
            if(i == 13){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        //Example: 5 Type a code to print all chars in a String one by one. If you see "x" stop printing
        // "I like extra effort"
        String str = "I like extra effort";

        for(int i = 0; i<str.length()-1; i++){
            char ch = str.charAt(i);
            if(ch == 'x'){
                break;
            }
            System.out.print(str.charAt(i));

        }
    }

}
