package queue;

import static linked.SingleLinkList.Node;


/**
 * Created by wangyun on 16-11-29.
 */
public class LinkedOrderQueue<T>{
    private int count;
    private Node<T> front;
    private Node<T> rear;

    public void enqueue(T element) {
        Node<T> node = new Node<>();
        if (isEmpty()) {
            front = node;
        } else {
            rear.next = node;
        }

        rear = node;
        count++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyQueueException("the queue is empty");
        }
        T result = front.item;
        front = front.next;
        count--;

        if (isEmpty()) {
            rear = null;
        }

        return result;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}
