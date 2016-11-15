package stack;

import java.lang.reflect.Array;
import java.util.EmptyStackException;

/**
 * Created by wangyun on 16-11-15.
 */
public class ArrayStack<T> implements Stack<T>{
    public static final int SIZE = 100;
    public T[] array;
    public int top;
    public int capacity;

    public ArrayStack(Class<T> type) {
        array = (T[]) Array.newInstance(type, SIZE);
        capacity = SIZE;
        top = -1;
    }

    public ArrayStack(Class<T> type, int cap) {
        int size;
        if (cap <= 0) {
            size = SIZE;
        } else {
            size = cap;
        }
        array = (T[]) Array.newInstance(type, size);
        capacity = size;
        top = -1;
    }

    @Override
    public void push(T element) {
        //if it get the max size, should expand the capacity?
        if (isFull()) {
            throw new StackOverflowError();
        }
        array[++top] = element;
    }

    @Override
    public T pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return array[top--];
    }

    @Override
    public T peek() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return array[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

}
