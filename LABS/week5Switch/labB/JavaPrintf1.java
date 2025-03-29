// Karol G00436758
import java.util.Calendar;
public class JavaPrintf1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR), month = cal.get(Calendar.MONTH), day = cal.get(Calendar.DAY_OF_WEEK);
        System.out.printf("Current year is: %d and month is: %d and day is: %d\n", year, month, day);
    }
}
