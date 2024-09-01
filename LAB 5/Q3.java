import java.util.Scanner;

class Time {
    int hr;
    int min;
    int sec;

    Time() {
        hr = 0;
        min = 0;
        sec = 0;
    }

    Time(int h, int m, int s) {
        hr = h;
        min = m;
        sec = s;
    }

    void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
    }

    Time add(Time t) {
        int totalsec = this.sec + t.sec;
        int totalmin = this.min + t.min + totalsec / 60;
        int totalhr = this.hr + t.hr + totalmin / 60;

        return new Time(totalhr % 24, totalmin % 60, totalsec % 60);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first time:");
        System.out.print("hr: ");
        int hr1 = scanner.nextInt();
        System.out.print("min: ");
        int min1 = scanner.nextInt();
        System.out.print("sec: ");
        int sec1 = scanner.nextInt();

        System.out.println("Enter second time:");
        System.out.print("hr: ");
        int hr2 = scanner.nextInt();
        System.out.print("min: ");
        int min2 = scanner.nextInt();
        System.out.print("sec: ");
        int sec2 = scanner.nextInt();

        Time t1 = new Time(hr1, min1, sec1);
        Time t2 = new Time(hr2, min2, sec2);

        Time t3 = t1.add(t2);
        System.out.print("Total time: ");
        t3.displayTime();

        scanner.close();
    }
}
