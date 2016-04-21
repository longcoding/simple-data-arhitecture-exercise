package queue;

/**
 * Created by longcoding on 2016. 4. 21..
 */

interface Queue {
    void insertQueue(char item);
    char deleteQueue();
    void delete();
    char peek();
}

public class SimpleQueue implements Queue {

    private int front;
    private int rear;
    private int queueSize;
    private char itemArray[];

    public SimpleQueue(int queueSize) {
        front = -1;
        rear = -1;
        this.queueSize = queueSize;
        itemArray = new char[this.queueSize];
    }

    public boolean isEmpty() {
        return (front == rear);
    }

    public boolean isFull() {
        return (rear == this.queueSize -1);
    }

    @Override
    public void insertQueue(char item) {
        if (isFull()) {
            throw new RuntimeException();
        }
        itemArray[++rear] = item;
    }

    @Override
    public char deleteQueue() {
        if (isEmpty()) {
            throw new RuntimeException();
        }
        return itemArray[++front];
    }

    @Override
    public void delete() {
        if (isEmpty()) {
            throw new RuntimeException();
        }
        ++front;
    }

    @Override
    public char peek() {
        if (isEmpty()) {
            throw new RuntimeException();
        }
        return itemArray[front+1];
    }
}

class SimpleQueueTest {
    public static void main(String[] args) {
        int queueSize = 5;
        SimpleQueue simpleQueue = new SimpleQueue(queueSize);

        simpleQueue.insertQueue('A');
        simpleQueue.insertQueue('B');

        simpleQueue.deleteQueue();

    }
}