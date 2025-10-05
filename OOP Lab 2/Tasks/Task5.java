class Time {
    private int hour;
    private int min;
    private int sec;

    public Time() {
        hour = 0;
        min = 0;
        sec = 0;
    }

    public boolean check(int h, int m, int s) {
        if (h < 0 || m < 0 || s < 0) {
            return false;
        } else {
            return true;
        }
    }

    public Time(int h, int m, int s) {
        boolean check = check(h, m, s);
        if (check) {
            m += s / 60;
            sec = s % 60;

            h += m / 60;
            min = m % 60;

            hour = h;
        } else {
            System.out.println("Time cannot be negative");
        }

    }

    public void displayTime() {
        System.out.printf("%d: %d: %d\n", hour, min, sec);
    }

    void setTime(int h, int m, int s) {
        boolean check = check(h, m, s);
        if (check) {
            m += s / 60;
            sec = s % 60;

            h += m / 60;
            min = m % 60;

            hour = h;
        } else {
            System.out.println("Time cannot be negative. Time Unchanged.");
        }
    }
}

public class Task5 {
    public static void main(String[] args) {
        Time time = new Time(12, 62, 122);
        time.displayTime();
        time.setTime(4, -2, 6);
        time.displayTime();
    }
}
