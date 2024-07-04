import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DataTime5{
//    Format Date and Time
    public static void main(String[] args){
      LocalDateTime now = LocalDateTime.now();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      String formattedDate = now.format(formatter);
      System.out.println(formattedDate);
    }
}
