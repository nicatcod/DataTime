import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class DataTime6{
// Get the Current Time
    public static void main(String[] args){
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(now.format(formatter));
    }
}
