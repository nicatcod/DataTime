import java.time.LocalDate;
public class DataTime3 {
    public static void main(String[] args) {
        //Subtract Days from a Date
        LocalDate today = LocalDate.of(2020, 2, 11);
        int day1 = 10;
        LocalDate newDate = today.minusDays(day1);
        System.out.println("indiki zaman"+today);
        System.out.println(" netice "+newDate);

    }
}
