package stack;

import java.util.EmptyStackException;

/**
 * Created by wangyun on 16-11-15.
 */
public class LinkedStack<T> implements Stack<T> {
    private int size;
    @Override
    public void push(T element) {
        Node<T> oldTop = top;
        top = new Node<T>();
        top.item = element;
        top.next = oldTop;
        size++;
    }

    @Override
    public T pop() {
        if (top.isEmpty()) {
            throw new EmptyStackException();
        }
        T item = top.item;
        top = top.next;
        size--;
        return item;
    }

    @Override
    public T peek() {
        if (top.isEmpty()) {
            throw new EmptyStackException();
        }
        return top.item;
    }

    @Override
    public boolean isEmpty() {
        return top.isEmpty();
    }

    private static class Node<E> {
        public E item;
        public Node<E> next;

        public boolean isEmpty() {
            return item == null && next == null;
        }
    }

    private Node<T> top;

    public LinkedStack() {
        top = new Node<T>();
    }


}
