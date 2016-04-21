package sort.merge;

/**
 * Created by longcoding on 2016. 4. 21..
 */
public class MergeSort {
    private int sorted[] = new int[30];
    public void merge(int a[], int start, int middle, int end) {
        int size = a.length;
        int i, j, k, t;
        i = start;
        j = middle + 1;
        k = start;
        while ( i<= middle && j<=end ) {
            if (a[i] < a[j]) sorted[k] = a[i++];
            else sorted[k] = a[j++];
            k++;
        }
        if ( i > middle) {
            for (t=j; t<=end; t++, k++) {
                sorted[k] = a[t];
            }
        } else {
            for(t=i; t<=middle; t++, k++) {
                sorted[k] = a[t];
            }
        }

        for(t=start; t<=end; t++) {
            a[t] = sorted[t];
        }

        for(int test=0; test<size; test++) {
            System.out.printf("%3d  ", a[test]);
        }
    }

    public void mergeSort(int a[], int m, int n) {
        int middle;
        if (m<n) {
            middle = (m+n)/2;
            mergeSort(a, m, middle);
            mergeSort(a, middle+1, n);
            merge(a, m, middle, n);
        }
    }
}

class MergeSortTest {
    public static void main(String[] args) {
        int a[] = {69, 10, 30, 2, 16, 8, 31, 22};

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(a, 0, a.length-1);
    }
}
