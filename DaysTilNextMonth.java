import java.time.LocalDate;

/**
 * DaysTilNextMonth
 */
public class DaysTilNextMonth {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        int dayOfMonth = currentDate.getDayOfMonth();
        int daysInMonth = currentDate.lengthOfMonth();
        int leftDays = daysInMonth - dayOfMonth;

        System.out.println("The numbers of days left until " + currentDate.plusMonths(1).getMonth() + " are " + leftDays);
    }
}