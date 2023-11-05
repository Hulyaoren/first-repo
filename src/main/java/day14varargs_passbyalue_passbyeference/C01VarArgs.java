package day14varargs_passbyalue_passbyeference;

public class C01VarArgs {

    public static void main(String[] args) {

        int r1 = add();
        System.out.println(r1);

        int r2 = add(3);
        System.out.println(r2);
        int r3 = add(3,4,9);
        int r4 = add(3,5,68,7,39,55,9,8);
        System.out.println(r4);

    }
    //Type a code to add integers

    public static int add(int a, int b){
        return a +b;
    }

    //what if I give you three ints?
    public static int add(int a, int b, int c){
        return a+b+c;
    }

   //"VarArgs" stands for "Variable Arguments"
    //"Vararg" has logic of Arrays behind. When using "Varargs" think of Arrays.
    //you can not add another parameter after Vararg
    //If you work with other parameters use them before Varargs
    //You can not use more than one Vararg in a method

    public static int add(int ... a){
        int sum = 0;
        for (int w:a){
            sum = sum + w;

        }
        return sum;
    }

}
