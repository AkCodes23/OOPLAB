class Bike {
    int speedLimit = 80;

    void run() {
        System.out.println("Bike speed limit: " + speedLimit);
    }
}

class Splendor extends Bike {
    int speedLimit = 120;

    void run() {
        System.out.println("Splendor speed limit: " + speedLimit);
    }
}

class Runtime {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();

        Bike splendor = new Splendor();
        splendor.run();
    }
}
