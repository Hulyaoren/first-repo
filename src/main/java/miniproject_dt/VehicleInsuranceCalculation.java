package miniproject_dt;

import java.util.Scanner;

public class VehicleInsuranceCalculation {
    /*
Project: Auto Insurance Payment Calculator
Vehicle types: car, truck, bus, motorcycle
              -bus: 18-30 seats or 31 and above seats
Tariff period: December 2024, June 2024
1st term: June 2024                      2nd term: December 2024
  cars: 2000                            cars: 2500
  truck: 3000                           truck: 3500
  bus: type1: 4000 type2: 5000          bus: type1: 4500 type2: 5500
  motorcycle: 1500                      motorcycle: 1750
In case of incorrect entry, the calculation failed warning should be given to the user and the menu should be shown again.
To be able to let user restart we should present option to restart
*/
    public static void main(String[] args) {
        startCalculation();

    }

    public static void startCalculation(){
        Scanner input = new Scanner(System.in);
       boolean isFailed;
        do {
          isFailed = false;
            System.out.println("----Welcome to the insurance calculator-----");
            System.out.println("Choose a term for insurance calculation");
            System.out.println("Press 1 - for term June 2024");
            System.out.println("Press 2- for term December 2024");
            int term = input.nextInt();
            //if the term value is not 1 or 2, ask user to restart the application
            if(term==1 || term ==2 ) {

                Vehicle objVehicle = new Vehicle();
                System.out.println("Enter the type of Vehicle for payment calculation");
                objVehicle.type = input.next().toUpperCase();
                objVehicle.payment = objVehicle.countPayment(term);

                //check if the payment is greater than 0, give a message to the user "Calculation done"
                //If the payment is zero, give a message to the user , "incorrect data entrance
                String termName = term==1? "June 2024" : "December 2024";
                int select;
                if (objVehicle.payment>0){
                    System.out.println("Calculation Done!..");
                    System.out.println("Vehicle Type: " + objVehicle.type);
                    System.out.println("term:" + termName);
                    System.out.println("Total Payment:" + objVehicle.payment);

                    System.out.println("To Restart Please Press 1 or to Exit Press 0");

                    select = input.nextInt();
                    if (select==1){
                        isFailed = true;
                    }else {
                        isFailed=false;
                    }

                } else {
                    System.out.println("Incorrect data entrance");
                    System.out.println("To Restart Please Press 1 or to Exit Press 0");

                    select = input.nextInt();
                    if (select==1){
                        isFailed = true;
                    }else {
                        isFailed=false;
                    }
                }


            }else {
                System.out.println("Incorrect data entrance");
                isFailed = true;
            }



        }while (isFailed);
    }

}
