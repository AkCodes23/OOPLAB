// AnalyzeOutputs.java
public class AnalyzeOutputs {
    public static void main(String[] args) {
        // Case a
        int x = 10;
        double y = x;
        System.out.println("Case a: " + y);

        // Case b
        double x2 = 10.5;
        //int y2 = x2; // This line will cause a compilation error due to incompatible types
        //System.out.println("Case b: " + y2);

        // Case c
        double x3 = 10.5;
        int y3 = (int) x3;
        System.out.println("Case c: " + y3);
    }
}
