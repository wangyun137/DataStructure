package queue;

import java.lang.reflect.Array;
import java.util.EmptyStackException;

/**
 * Created by wangyun on 16-11-15.
 */
public class ArrayOrderQueue<T> implements Queue<T> {
    private int itemCount;
    private int rear;
    private int front;
    private int maxSize;
    private T[] array;

    public ArrayOrderQueue(int capacity, Class<T> type) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity must more than 0");
        }
        rear = -1;
        front = 0;
        maxSize = capacity;
        itemCount = 0;
        array = (T[]) Array.newInstance(type, maxSize);
    }

    @Override
    public void enqueue(T value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        array[++rear] = value;
        itemCount++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyQueueException("this queue is empty");
        }
        T result = array[front];
        array[front] = null;
        front++;
        itemCount--;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return itemCount == 0;
    }

    @Override
    public int size() {
        return itemCount;
    }

    @Override
    public boolean isFull() {
        return itemCount == maxSize;
    }
}
