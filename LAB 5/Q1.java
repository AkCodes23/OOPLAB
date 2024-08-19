class Box {
    double width;
    double height;
    double depth;

    // Parameterized constructor to initialize dimensions
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate and return volume
    double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box myBox = new Box(5.0, 6.0, 7.0);
        System.out.println("Volume of the box: " + myBox.getVolume());
    }
}
