package day_15dateandtime_enum_stringbuilder;

import javax.security.sasl.SaslClient;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class C02DateAndTime03 {
    public static void main(String[] args) {
        //Ask user to enter his date of birth then tell user the day name

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year");
        int year = input.nextInt();
        System.out.println("Please enter month");
        int month =input.nextInt();
        System.out.println("Please enter day");
        int day = input.nextInt();

        LocalDate dateOfBirth = LocalDate.of(year, month, day);

        System.out.println("dateOfBirth = " + dateOfBirth);
        DayOfWeek birthDay = dateOfBirth.getDayOfWeek();
        System.out.println("birthDay = " + birthDay);


    }
}
