import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DataTime2 {
    public static void main(String[] args) {
        //Calculate the Difference Between Two Dates

        LocalDate date1 = LocalDate.of(2024, 7, 4);
        LocalDate data2 = LocalDate.of(2025, 6, 6);
        Period period = Period.between(date1, data2);
        int years=period.getYears();
        int months=period.getMonths();
        int days=period.getDays();
        System.out.println("Arsasindaki ferq -  " +years+" - il - " +months+" - ay - "+days+" - gun");
        long total = ChronoUnit.DAYS.between(data2, LocalDate.now());
        System.out.println("cemi"+total+"gun");


    }
}