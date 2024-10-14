class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

class Exercise4 {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("This is a custom error message.");
        } catch (MyCustomException e) {
            System.out.println("Caught the custom exception:");
            System.out.println(e.getMessage());
        }
    }
}

