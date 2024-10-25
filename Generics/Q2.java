public class GenericStack<T> {
    private T[] stack;
    private int top;

    public GenericStack(int capacity) {
        stack = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T item) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = item;
    }

    public T pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return null;
        }
        return stack[top--];
    }

    public T peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
