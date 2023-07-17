import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        LocalDateTime localDateTime=LocalDateTime.now();
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(localDate);
    }
}
