// Converts minutes into hours and minutes
import java.util.*;

public class question5 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the minutes: ");
        int minutes = sc.nextInt();
        // Find hours
        int hours = minutes / 60;

        // Find remaining minutes
        int remainingMinutes = minutes % 60;

        System.out.println("The hours are: " + hours);
        System.out.println("The minutes are: " + remainingMinutes);
    }
}