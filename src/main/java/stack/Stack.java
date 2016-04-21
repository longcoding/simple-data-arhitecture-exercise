package stack;

/**
 * Created by longcoding on 2016. 4. 21..
 */
interface StackStructure {
    boolean isEmpty();
    void push(char item);
    char pop();
    void delete();
    char peek();
}

public class Stack implements StackStructure {

    private int top = -1;
    private int stackSize;
    private char itemArray[];

    public Stack(int stackSize) {
        this.stackSize = stackSize;
        itemArray = new char[stackSize];
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == stackSize - 1);
    }

    @Override
    public void push(char item) {
        if (isFull()) {
            throw new Error();
        }
        itemArray[++top] = item;
    }

    @Override
    public char pop() {
        if (isEmpty()) {
            throw new Error();
        }
        return itemArray[top--];
    }

    @Override
    public void delete() {
        top--;
    }

    @Override
    public char peek() {
        return itemArray[top];
    }
}
