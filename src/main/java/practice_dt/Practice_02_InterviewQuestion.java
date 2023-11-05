package practice_dt;

public class Practice_02_InterviewQuestion {

    public static void main(String[] args) {

        //Example1: Type code to swap two integers
        //           a= 12 and b=5 ==> a=5 abd b=12

        int a =12;
        int b =5;
        System.out.println("before  swapping: " + a+ " " + b);
        System.out.println(a+b);
        int temp =0;

        temp =a;
        a=b;
        b=temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("after  swapping: " + a+ " " + b);

    //2.way: do not create a third container

        int x= 12;
        int y= 5;
        System.out.println("before swapping " + x+ " " +y);

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("after swapping " + x+ " " +y);


    }

}
