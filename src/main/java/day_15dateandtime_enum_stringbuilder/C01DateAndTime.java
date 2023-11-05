package day_15dateandtime_enum_stringbuilder;


    import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
    public class C01DateAndTime {
        public static void main(String[] args) {
            // How to get local date:
            LocalDate myDate = LocalDate.now(); // Obtains the current date from the system clock in the default time-zone.
            System.out.println("myDate = " + myDate);  // 2023-10-15
            // How to go to future date
            LocalDate futureDate =myDate.
                    plusDays(3).
                    plusMonths(2).
                    plusYears(3); // method chain
            System.out.println(futureDate);
            // How to go to past
            LocalDate partDate = myDate.minusMonths(5).minusYears(2).minusDays(2);
            // How to Format Date:
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            String currentDate = dtf.format(myDate);
            System.out.println(currentDate);
            DateTimeFormatter dt = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
            String currentDate1 = dt.format(myDate);
            System.out.println(currentDate1);
            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
            String currentDate2 = dtf2.format(myDate);
            System.out.println(currentDate2);
            // How to find date in another place:
            LocalDate dateInJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
            System.out.println("dateInJapan = " + dateInJapan);
            // How to get local time:
            LocalTime currentTime = LocalTime.now();
            System.out.println("currentTime = " + currentTime);
            // How to go future and past:
            LocalTime anotherTime  = currentTime.
                    plusHours(2).
                    plusMinutes(20).
                    minusSeconds(30);
            // How to format time:
            //DateTimeFormatter f1 = DateTimeFormatter.ofPattern("HH:mm"); // 17:26
            DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:mm a");
            String strTime = f1.format(currentTime);
            System.out.println("strTime = " + strTime);
            // Local time in Toronto:
            LocalTime timeInToronto = LocalTime.now(ZoneId.of("America/Toronto"));
            System.out.println("timeInToronto = " + timeInToronto);
            // How to set certain time:
            // 15:30
            LocalTime time = LocalTime.of(15,30);
            System.out.println("time = " + time);
            // How to get both date and time:
            LocalDateTime dateAndTime = LocalDateTime.now();
            System.out.println("dateAndTime = " + dateAndTime);// 2023-10-17T17:38:58.266792
            System.out.println("dateAndTime.getDayOfYear() = " + dateAndTime.getDayOfYear());
            System.out.println("dateAndTime.getDayOfMonth() = " + dateAndTime.getDayOfMonth());
            System.out.println(dateAndTime.getDayOfWeek());
            System.out.println("dateAndTime.getMonthValue() = " + dateAndTime.getMonthValue()); //ex: 07
            Month month1 = dateAndTime.getMonth();  //ex: JULY
            System.out.println(month1.toString().toLowerCase());
            System.out.println("month1 = " + month1);
            //Example 4: If the given date is before the current date give message to user like "Invalid date"
            //           If the given date equals the current date give message to user like "Give the time"
            //           If the time is before current time tell to user "No ticket" otherwise tell to user "There is just 1 ticket"
            //           If the given date is after the current date give message to user like "Buy the ticket"
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter the date...");
            System.out.println("First enter year...");
            int year = input.nextInt();
            System.out.println("Second enter month...");
            int month = input.nextInt();
            System.out.println("Last enter day...");
            int day = input.nextInt();
            LocalDate givenDate = LocalDate.of(year,month,day);
            if (givenDate.isBefore(myDate)){
                System.out.println("Invalid Date!...");
            } else if (givenDate.isEqual(myDate)) {
                System.out.println("Enter the hour:...");
                int hour = input.nextInt();
                System.out.println("Enter the minutes:...");
                int minutes = input.nextInt();
                LocalTime givenTime = LocalTime.of(hour,minutes);
                if (givenTime.isAfter(currentTime)){
                    System.out.println("There is just 1 ticket");
                } else {
                    System.out.println("No ticket !");
                }
            } else if (givenDate.isAfter(myDate)) {
                System.out.println("Buy ticket!...");
            }
        }
    }

