class MatrixMaxFinder {
    public static void main(String[] args) {
        int[][] matrix = {
            {122, 714, 167},
            {91, 152, 911},
            {418, 139, 281}
        };

        MaxFinder evenMaxFinder = new MaxFinder(matrix, true);
        MaxFinder oddMaxFinder = new MaxFinder(matrix, false);

        Thread evenThread = new Thread(evenMaxFinder);
        Thread oddThread = new Thread(oddMaxFinder);

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int evenMax = evenMaxFinder.getMax();
        int oddMax = oddMaxFinder.getMax();

        int overallMax = Math.max(evenMax, oddMax);

        System.out.println("Maximum of even numbers: " + evenMax);
        System.out.println("Maximum of odd numbers: " + oddMax);
        System.out.println("Overall maximum: " + overallMax);
    }
}

class MaxFinder implements Runnable {
    private int[][] matrix;
    private boolean findEven;
    private int max;

    public MaxFinder(int[][] matrix, boolean findEven) {
        this.matrix = matrix;
        this.findEven = findEven;
        this.max = findEven ? Integer.MIN_VALUE : Integer.MIN_VALUE;
    }

    public int getMax() {
        return max;
    }

    
    public void run() {
        for (int[] row : matrix) {
            for (int num : row) {
                if (findEven && num % 2 == 0) {
                    max = Math.max(max, num);
                } else if (!findEven && num % 2 != 0) {
                    max = Math.max(max, num);
                }
            }
        }
    }
}
