import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class DataTime1 {
    public static void main(String[] args) {
        //Get the Current Time in a Different Time Zone

        ZoneId zoneId = ZoneId.of("Europe/Berlin");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDateTime = zonedDateTime.format(formatter);
        System.out.println(" anliq " + zoneId + " " + formattedDateTime);

        System.out.println("==============================");
    }
}
