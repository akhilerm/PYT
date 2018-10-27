public class Stack {
    int top = -1;
    int store[];

    public Stack() {
        this(1000);
    }

    public Stack(int size) {
        store = new int[size];
    }

    void push(int k) {
        store[++top] = k;
    }

    int pop() {
        return store[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }

    void print() {
        if (top == -1) {
            System.out.println("EMPTY");
        }
        else {
            System.out.println(store[top]);
        }
    }

    void printAll() {
        System.out.print("[");
        for (int i = 0;i <= top;i++) {
            System.out.print(store[top] + " ");
        }
        System.out.println("]");
    }
}