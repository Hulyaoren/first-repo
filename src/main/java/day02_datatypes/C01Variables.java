package day02_datatypes;

public class C01Variables {


    public static void  main(String[] args){
        byte stdAge = 25;

        System.out.println(stdAge);

        short stdNumber = 3245;
        System.out.println(stdNumber);

        int populationOfMiami = 1200000;
        System.out.println(populationOfMiami);
//if we write long variable that is not in range of an integer, we need to add "L" to the end
        long  popOfWorld = 7000000000L;
        System.out.println(popOfWorld);
//if we write long variable that is in range of an integer, we don't need to add "L" to the end
        long popOfChina = 150000000;
        System.out.println(popOfChina);

        float shirtPrice = 23.34F;
        System.out.println(shirtPrice);

        double weightOffCell = 0.0000000012;
        System.out.println(weightOffCell);
        System.out.println("weightOffCell = " + weightOffCell);

        boolean isRetired = false;
        System.out.println("is retired = " + isRetired);

        char initial = 'H';
        System.out.println(initial);

        String name = "Hulya Oren";
        System.out.println("name = " + name);
    }
}
