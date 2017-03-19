package tree.heap;

import queue.EmptyQueueException;

/**
 * Created by wangyun on 17/3/19.
 */
public class LinkedHeapTree<T> implements HeapADT<T>{

    private HeapNode<T> root;
    private HeapNode<T> lastNode;
    private int count;

    public LinkedHeapTree() {
        count = 0 ;
        root = null;
        lastNode = null;
    }

    public LinkedHeapTree(T element) {
        count = 0;
        root = new HeapNode<T>(element);
        lastNode = root;
    }

    @Override
    public boolean isEmpty() {
        return root == null && count == 0;
    }

    @Override
    public void addElement(T element) {
        HeapNode<T> node = new HeapNode<T>(element);

        if (root == null) {
            root = node;
        } else {
            HeapNode<T> nextParent = getNextParent();

            if (nextParent.left == null) {
                nextParent.left = node;
            } else {
                nextParent.right = node;
            }

            node.parent = nextParent;
        }

        lastNode = node;
        //re-sort the heap

        if (count > 1) {
            resortAfterAdd();
        }
    }

    private HeapNode<T> getNextParent() {
        HeapNode<T> result = lastNode;

        while (result != root && result.parent.left != result) {
            result = result.parent;
        }

        if (result != root) {
            if (result.parent.right == null) {
                result = result.parent;
            } else {
                result = (HeapNode<T>)result.parent.right;
                while (result.left != null) {
                    result = (HeapNode<T>)result.left;
                }
            }
        } else {
            while (result.left != null) {
                result = (HeapNode<T>)result.left;
            }
        }

        return result;
    }

    private void resortAfterAdd() {
        T temp;
        HeapNode<T> next = lastNode;
        temp = next.element;

        while (next != root && ((Comparable)temp).compareTo(next.parent.element) < 0 ) {
            next.element = next.parent.element;
            next = next.parent;
        }

        next.element = temp;
    }

    @Override
    public T removeMin() {

        if (count == 0) {
            throw new EmptyQueueException("Heap is empty");
        }

        T min = root.element;

        if (count == 1) {
            root = null;
            lastNode = null;
        } else {
            //find the new last node
            HeapNode<T> newLastNode = getNewLastNode();

            if (lastNode.parent.left == lastNode) {
                lastNode.parent.left = null;
            } else {
                lastNode.parent.right = null;
            }
            root.element = lastNode.element;
            lastNode = newLastNode;
            //re-sort heap
            resortAfterRemove();
        }

        count--;

        return min;
    }

    private HeapNode<T> getNewLastNode() {
        HeapNode<T> result = lastNode;
        while (result != root && result.parent.left == result) {
            result = result.parent;
        }

        if (result != root) {
            result = (HeapNode<T>)result.parent.left;
        }

        while (result.left != null) {
            result = (HeapNode<T>)result.right;
        }

        return result;
    }

    private void resortAfterRemove() {
        T temp;
        HeapNode<T> node = root;
        HeapNode<T> left = (HeapNode<T>)node.left;
        HeapNode<T> right = (HeapNode<T>)node.right;
        HeapNode<T> next;

        if (left == null && right == null) {
            next = null;
        } else if (left == null) {
            next = right;
        } else if (right == null) {
            next = left;
        } else if (((Comparable)left.element).compareTo(right.element) < 0) {
            next = left;
        } else {
            next = right;
        }

        temp = node.element;

        while ((next != null) && ((Comparable)next.element).compareTo(temp) < 0) {
            node.element = next.element;
            node = next;
            left = (HeapNode<T>)node.left;
            right = (HeapNode<T>)node.left;

            if (left == null && right == null) {
                next = null;
            } else if (left == null) {
                next = right;
            } else if (right == null) {
                next = left;
            } else if (((Comparable)left.element).compareTo(right.element) < 0) {
                next = left;
            } else {
                next = right;
            }
        }
        next.element = temp;
    }
}
