class Box {
    double width;
    double height;
    double depth;

    void dim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double getVolume() {
        return width * height * depth;
    }
}

class Test {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.dim(5.0, 6.0, 7.0);
        System.out.println("Volume of the box: " + myBox.getVolume());
    }
}
