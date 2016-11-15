package queue;

import java.lang.reflect.Array;
import java.util.EmptyStackException;

/**
 * Created by wangyun on 16-11-15.
 */
public class CircleQueue<T> implements Queue<T> {
    public int itemCount;
    public int maxSize;
    public int front;
    public int rear;
    public T[] array;

    public CircleQueue(int capacity, Class<T> type) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity must more than 0");
        }
        itemCount = 0;
        maxSize = capacity;
        front = 0;
        rear = -1;
        array = (T[]) Array.newInstance(type, maxSize);
    }

    @Override
    public void insert(T value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        rear = ++rear % maxSize;
        array[rear] = value;
        itemCount++;
    }

    @Override
    public T remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        front = front % maxSize;
        itemCount--;
        return array[front++];
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


}
