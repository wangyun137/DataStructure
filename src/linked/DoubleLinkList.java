package linked;

/**
 * Created by wangyun on 16-11-15.
 */
public class DoubleLinkList<T> {

    public static class Node<E> {
        public E item;
        public Node<E> next;
        public Node<E> prev;
    }

    public Node<T> first;
    public Node<T> last;
    public int itemCount;

    public void addFirst(T item) {
        Node<T> oldFirst = first;
        first = new Node<>();
        first.item = item;
        first.next = oldFirst;
        oldFirst.prev = first;
        if (itemCount == 0) {
            last = first;
        }
        itemCount++;
    }

    public void addLast(T item) {
        Node<T> oldLast = last;
        last = new Node<T>();
        last.item = item;
        last.prev = oldLast;
        oldLast.next = last;
        if (itemCount == 0) {
            first = last;
        }
        itemCount++;
    }

    public T delFirst() {
        if (first == null) {
            throw new NullPointerException();
        }
        T item = first.item;
        //reset the first pointer
        first = first.next;
        if (first != null) {
            first.prev = null;
        }
        //it means only one node in list
        if (itemCount == 1) {
            last = null;
        }
        itemCount--;
        return item;
    }

    public T delLast() {
        if (last == null) {
            throw new NullPointerException();
        }
        T item = last.item;
        last = last.prev;
        if (last != null) {
            last.next = null;
        }
        if (itemCount == 1) {
            first = null;
        }
        itemCount--;
        return item;
    }

    public void addBefore(T targetItem, T item) {
        if (first == null) {
            throw new NullPointerException();
        }
        Node<T> target = first;
        //should use equals?
        while(target != null && !target.item.equals(targetItem)) {
            target = target.next;
        }
        if (target.prev == null) {
            addFirst(item);
        } else {
            Node<T> oldPrev = target.prev;
            Node<T> newNode = new Node<T>();
            newNode.item = item;
            newNode.next = target;
            newNode.prev = oldPrev;
            target.prev = newNode;
            oldPrev.next = newNode;
            itemCount++;
        }
    }

    public void addAfter(T targetItem, T item) {
        if (first == null) {
            throw new NullPointerException();
        }
        Node<T> target = first;
        while (target != null && !target.item.equals(targetItem)) {
            target = target.next;
        }
        if (target.next == null) {
            addLast(item);
        } else {
            Node<T> newNode = new Node<T>();
            Node<T> oldNext = target.next;
            newNode.item = item;
            newNode.next = oldNext;
            newNode.prev = target;
            target.next = newNode;
            oldNext.prev = newNode;
            itemCount++;
        }
    }
}
