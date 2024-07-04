import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class DataTime1 {
    public static void main(String[] args) {
        //Get the Current Time in a Different Time Zone

        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = zonedDateTime.format(formatter);
        System.out.println(" anliq " + zoneId + " " + formattedDateTime);

        System.out.println("==============================");
    }
}
