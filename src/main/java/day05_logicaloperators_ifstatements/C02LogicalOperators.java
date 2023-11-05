package day05_logicaloperators_ifstatements;

public class C02LogicalOperators {



        /*

        ----------------- And Operator ---------------

                  Tea        &       Cake             Order
                  T         &&        F                F
                  F         &&        T                F
                  F         &&        F                F
                  T         &&        T                T

         */

    public static void main(String[] args) {

        int a = 12;
        int b = 4;

        System.out.println( (a>b) && (a == b*3) && (a/b==3) && (a%b== 3));
        //And operator is perfectionist --> single false makes the result false.

        System.out.println( (a<b) && (a == b*3) && (a/b==3) && (a%b== 3));
        //In above code after getting false java will not execute the codes.

        //If you use single "&" sign, java will check all operations.
        System.out.println( (a>b) & (a == b*3) & (a/b==3) & (a%b== 3));

               /*
        ------------------------Or Operator----------------------
                Cafe    or     Tea     Order
                F       ||      T       T
                T       ||      F       T
                T       ||      T       T
                F       ||      F       F
         */

        System.out.println( (a>b) || (a == b*3) || (a/b==3) || (a%b== 3));
        // single true is enough to make result true

        // If we need to use "And" operator togther with "or" operator try to use "()"

        System.out.println( ((a>b) && (a == b*3) || (a/b==3)) || (a%b== 3));

        System.out.println( (a>b) && ((a == b*3) || (a/b==3) || (a%b== 3)));





    }

}
