
class Counter {
    static int count = 0;
      Counter() {
        count++;
    }
    public static void display_count() {
        System.out.println("Number of objects created: " + count);
    }
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        Counter.display_count();
    }
}
