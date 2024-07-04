import java.time.ZoneId;
import java.util.Set;

public class DataTimeZonaTap {
    public static void main(String[] args) {
        // Tüm geçerli zaman dilimi kimliklerini alın
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        // Bölge kimliklerini yazdırın
        for (String zoneId : allZoneIds) {
            System.out.println(zoneId);
        }
    }
}
