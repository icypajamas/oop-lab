import java.util.Scanner;

class Time {
    int hour;
    int minutes;
    int seconds;
    String amPm;

    public void displayTime() {
        System.out.printf("The time is %d:%d:%d %s", hour, minutes, seconds, amPm);
    }

    public void setTime(int a, int b, int c, String d) {
        hour = a;
        minutes = b;
        seconds = c;
        amPm = d;

    }

}

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time currentTime = new Time();

        System.out.print("Enter the current hour: ");
        int a = scanner.nextInt();
        System.out.print("Enter the current minutes: ");
        int b = scanner.nextInt();
        System.out.print("Enter the current seconds: ");
        int c = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter AM/PM: ");
        String d = scanner.nextLine();

        currentTime.setTime(a, b, c, d);
        currentTime.displayTime();
        scanner.close();
    }
}
