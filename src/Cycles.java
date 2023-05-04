import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Cycle {

        public static void main(String[] args) {
            System.out.println(calculatePeriods("01/02/2001",  28));
        }
        public static String calculatePeriods(String lastPeriodDate, int cycleDays) {
            LocalDate date = LocalDate.parse(lastPeriodDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            List<LocalDate> dates = new ArrayList<>();
            for (int i = 0; i <= 12; i++) {
                dates.add(date);
                date = date.plusDays(cycleDays);
            }
            return dates.toString();
        }
    }
}