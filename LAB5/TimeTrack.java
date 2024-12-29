package timetrack;
import java.util.Scanner;
public class TimeTrack {
 static String swimST, swimET, workST, workET, choresST, choresET;

    public static int indTimeTotal(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int min = Integer.parseInt(parts[1]);
        int res = hour + min / 60;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the following time in the 24-hour format");
        System.out.println("Enter start time on task swimming: ");
        swimST = sc.nextLine();
        System.out.println("Enter end time on task swimming: ");
        swimET = sc.nextLine();

        System.out.println("Enter start time on task workout: ");
        workST = sc.nextLine();
        System.out.println("Enter end time on task workout: ");
        workET = sc.nextLine();

        System.out.println("Enter start time on task house chores: ");
        choresST = sc.nextLine();
        System.out.println("Enter end time on task house chores: ");
        choresET = sc.nextLine();

        int totalSwimming = indTimeTotal(swimET) - indTimeTotal(swimST);
        int totalWorkout = indTimeTotal(workET) - indTimeTotal(workST);
        int totalChores = indTimeTotal(choresET) - indTimeTotal(choresST);
        int grandTotal = (totalSwimming + totalWorkout + totalChores) * 7;

        System.out.println("Total time spent working this week: " + grandTotal);
        if (grandTotal < 40) {
            System.out.println("ALERT!!! Your total time spent working this week is less than 40 hours.");
        }
    }
}
