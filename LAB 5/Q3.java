import java.util.Scanner;

class Time {
    int hours;
    int minutes;
    int seconds;

    Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    Time add(Time t) {
        int totalSeconds = this.seconds + t.seconds;
        int totalMinutes = this.minutes + t.minutes + totalSeconds / 60;
        int totalHours = this.hours + t.hours + totalMinutes / 60;

        return new Time(totalHours % 24, totalMinutes % 60, totalSeconds % 60);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first time:");
        System.out.print("Hours: ");
        int hours1 = scanner.nextInt();
        System.out.print("Minutes: ");
        int minutes1 = scanner.nextInt();
        System.out.print("Seconds: ");
        int seconds1 = scanner.nextInt();

        System.out.println("Enter second time:");
        System.out.print("Hours: ");
        int hours2 = scanner.nextInt();
        System.out.print("Minutes: ");
        int minutes2 = scanner.nextInt();
        System.out.print("Seconds: ");
        int seconds2 = scanner.nextInt();

        Time t1 = new Time(hours1, minutes1, seconds1);
        Time t2 = new Time(hours2, minutes2, seconds2);

        Time t3 = t1.add(t2);
        System.out.print("Total time: ");
        t3.displayTime();

        scanner.close();
    }
}
