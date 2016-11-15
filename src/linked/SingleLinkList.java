package linked;

/**
 * Created by wangyun on 16-11-15.
 */
public class SingleLinkList<T> {

    public static class Node<E> {
        E item;
        Node<E> next;
    }

    public Node<T> first;
    public int itemCount;

    public void addFirst(T item) {
        Node<T> oldFirst = first;
        first = new Node<>();
        first.item = item;
        first.next = oldFirst;
        itemCount++;
    }

    public T delFirst() {
        if (first == null) {
            throw new NullPointerException();
        }
        T item = first.item;
        first = first.next;
        itemCount--;
        return item;
    }

    public Node<T> reverseList() {
        if (first == null) {
            throw new NullPointerException();
        }
        Node<T> prev = null;
        Node<T> newHead = null;
        Node<T> next;
        Node<T> current = first;
        while (current != null) {
            next = current.next;
            current.next = prev;
            if (next == null) {
                newHead = current;
            }
            prev = current;
            current = newHead;
        }
        return newHead;
    }
}
