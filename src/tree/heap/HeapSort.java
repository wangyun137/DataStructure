package tree.heap;

/**
 * Created by wangyun on 17/3/19.
 */
public class HeapSort<T> {
    private void sort(T[] data, int min, int max) {
        LinkedHeapTree<T> linkedHeapTree = new LinkedHeapTree<T>();

        for (int i = min; i < max; i++) {
            linkedHeapTree.addElement(data[i]);
        }

        int count = min;
        while (!linkedHeapTree.isEmpty()) {
            data[count] = linkedHeapTree.removeMin();
            count++;
        }
    }
}
