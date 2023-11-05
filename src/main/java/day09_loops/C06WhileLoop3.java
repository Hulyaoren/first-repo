package day09_loops;

public class C06WhileLoop3 {

    public static void main(String[] args) {
        //find sum of integer

        int num = 587;
        int sum = 0;
        while (num>0){
            sum += num%10;
            num = num/10;
        }
        System.out.println(sum);

        //print table of multiplication for a given number
        // 3--> 3*1 = 3  3*2 = 6 ... 3*10=30

        int x = 3;
        int y=1;

        while (y<11) {

            System.out.println(x + "*" + y + "=" + x*y);
            y++;

        }
    }

}


