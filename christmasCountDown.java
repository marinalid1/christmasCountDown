import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Year;
import java.time.Duration;

public class christmasCountDown {
    public static void main(String[] args) {
        // get current year
        Year currentYear = Year.now();
        // convert current year into int
        int yearValue = currentYear.getValue();
        // date gets current Date
        LocalDateTime date = LocalDateTime.now();
        // xMas is date of Christmas
        LocalDateTime xMas = LocalDateTime.of(yearValue, 12, 25, 0, 0, 0);
        // duration calculates Duration between date and xMas
        Duration duration = Duration.between(date, xMas);
        // daysTillChristmas calculates days untill Christmas
        long daysTillChristmas = duration.toDays();
        // hoursTillChristmas calculates hours untill Christmas
        long hoursTillChristmas = duration.toHours() % 24;
        // minutesTillChristmas calculates mintues untill Christmas
        long minutesTillChristmas = duration.toMinutes() % 60;
        // secondsTillChristmas calculates seconds untill Christmas
        long secondsTillChristmas = duration.toSeconds() % 60;
        // dateFormat formats current date
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM-dd hh:mm:ss a");
        // dateString turns dateFormat into String
        String dateString = date.format(dateFormat);
        // prints out current day
        System.out.println("Today's time and date are " + dateString);
        // prints out number of days till Christmas
        System.out.println("There are " + daysTillChristmas + " days " + hoursTillChristmas + " hours " + minutesTillChristmas + " minutes "+ secondsTillChristmas + " seconds until Christmas");

    }
}