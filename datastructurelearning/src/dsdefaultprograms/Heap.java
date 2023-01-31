package dsdefaultprograms;

public class Heap {

    int heapSize;

    void build_max_heap(int[] a) {
        heapSize = a.length;
        for (int i = (heapSize / 2); i >= 0; i--)
            max_heapify(a, i);

    }

    void max_heapify(int[] a, int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest = i;
        if (l < heapSize && a[l] > a[largest])
            largest = l;
        if (r < heapSize && a[r] > a[largest])
            largest = r;
        if (largest != i) {
            int t = a[i];
            a[i] = a[largest];
            a[largest] = t;
            max_heapify(a, largest);
        }

    }

    // to delete the max element

    int extract_max(int[] a) {
        if (heapSize < 0)
            System.out.println("underflow");
        int max = a[0];
        a[0] = a[heapSize - 1];
        heapSize--;
        max_heapify(a, 0);
        return max;
    }

    void increase_key(int[] a, int i, int key) {
        if (key < a[i])
            System.out.println("error");
        a[i] = key;
        while (i >= 0 && a[(i - 1) / 2] < a[i]) {
            int t = a[(i - 1) / 2];
            a[(i - 1) / 2] = a[i];
            a[i] = t;

            i = (i - 1) / 2;
        }
    }

    void print_heap(int a[]) {
        for (int i = 0; i < heapSize; i++)
            System.out.println(a[i] + " ");
    }
}
