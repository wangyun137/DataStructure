package queue;

import java.lang.reflect.Array;
import java.util.EmptyStackException;

/**
 * Created by wangyun on 16-11-15.
 */
public class ArrayCircleQueue<T> implements Queue<T> {
    private int itemCount;
    private int maxSize;
    private int front;
    private int rear;
    private T[] array;
    private Class<T> type;

    public ArrayCircleQueue(int capacity, Class<T> type) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity must more than 0");
        }
        this.itemCount = 0;
        this.maxSize = capacity;
        this.front = 0;
        this.rear = -1;
        this.type = type;
        this.array = (T[]) Array.newInstance(type, maxSize);
    }

    @Override
    public void enqueue(T value) {
        if (isFull()) {
            throw new StackOverflowError();
            //or expand the capacity
        }
        rear = ++rear % maxSize;
        array[rear] = value;
        itemCount++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T result = array[front];
        array[front] = null;
        front = (front + 1) % maxSize;
        itemCount--;

        if (isEmpty()) {
            rear = -1;
            front = 0;
        }
        return result;
    }

    @Override
    public boolean isFull() {
        return itemCount == maxSize;
    }

    @Override
    public boolean isEmpty() {
        return itemCount == 0;
    }

    @Override
    public int size() {
        return itemCount;
    }

    private void expandCapacity() {
        T[] larger = (T[]) Array.newInstance(type, maxSize * 2);
        for (int i = 0; i < itemCount; i++) {
            larger[i] = array[front];
            front = (front + 1) % itemCount;
        }
        front = 0;
        rear = itemCount;
    }


}
