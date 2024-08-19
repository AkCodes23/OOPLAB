class Time {
    int hours;
    int minutes;
    int seconds;

    // Constructor to initialize time to zero
    Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    // Constructor to initialize time to specific values
    Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    // Method to display time in hh:mm:ss format
    void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    // Method to add two Time objects
    Time add(Time t) {
        int totalSeconds = this.seconds + t.seconds;
        int totalMinutes = this.minutes + t.minutes + totalSeconds / 60;
        int totalHours = this.hours + t.hours + totalMinutes / 60;

        return new Time(totalHours % 24, totalMinutes % 60, totalSeconds % 60);
    }

    public static void main(String[] args) {
        Time t1 = new Time(1, 45, 30);
        Time t2 = new Time(2, 30, 45);

        Time t3 = t1.add(t2);
        t3.displayTime();
    }
}
