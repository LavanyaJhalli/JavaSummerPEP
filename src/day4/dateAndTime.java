package day4;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class dateAndTime {
    public static String getCurrentDateTime() {
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return current.format(formatter);
    }
    public static void main(String[] args) {
        // Call the method and display the result
        String dateTime = getCurrentDateTime();
        System.out.println("Current Date and Time: " + dateTime);
    }

}
