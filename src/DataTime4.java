import java.time.LocalDate;

public class DataTime4 {
    public static void main(String[] args) {
        //Add Days to a Date
        LocalDate today = LocalDate.of(2020, 4, 25);
        int il = 10;
        LocalDate newDate = today.plusDays(il);
        System.out.println("indiki zaman" + today);
        System.out.println("netice" + newDate);
    }
}
