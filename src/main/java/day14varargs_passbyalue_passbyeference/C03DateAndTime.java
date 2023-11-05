package day14varargs_passbyalue_passbyeference;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C03DateAndTime {

    public static void main(String[] args) {

        //How to get local date:
        LocalDate myDate = LocalDate.now();
        System.out.println("myDate = " + myDate);

        //future date
        LocalDate futureDate = myDate.
                plusDays(3).
                plusMonths(2).
                plusYears(3);
        System.out.println("futureDate = " + futureDate);

        //How to go to past
        LocalDate pastDate = myDate.
                minusMonths(5).
                minusDays(2).
                minusYears(3);
        System.out.println("pastDate = " + pastDate);

        //How to Format Date:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy");
        String currentDate = dtf.format(myDate);
        System.out.println(currentDate);

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("MMM/dd/yy");
        String currentDate1 = dt.format(myDate);
        System.out.println(currentDate1);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM/dd/yy");
        String currentDate2 = dtf2.format(myDate);
        System.out.println(currentDate2);


    }
}
