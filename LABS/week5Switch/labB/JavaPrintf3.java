// Karol G00436758
import java.util.Calendar;
public class JavaPrintf3 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        double temperature = 14.5D;
        String days[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int dayN = cal.get(Calendar.DAY_OF_WEEK);
        String day = days[dayN];
        int counter = 100;
        float wage = 200.50F;
        System.out.printf("Temperature is: %.1f\nToday is: %s\nThe counter is at: %d\nWages are: %.2f\n", temperature, day, counter, wage);
    }
}