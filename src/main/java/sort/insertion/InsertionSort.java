package sort.insertion;

/**
 * Created by longcoding on 2016. 4. 21..
 */
public class InsertionSort {
    public void insertionSort(int[] a, int size) {
        int i, j, t, temp;
        for (i=1; i<size; i++) {
            temp = a[i];
            j = i;
            while((j>0) && (a[j-1]>temp)) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = temp;

            for (int k=0; k < size; k++){
                System.out.printf("%3d   ", a[k]);
            }
            System.out.println();

        }
    }
}

class insertSortTest {
    public static void main(String[] args) {
        int a[] = {69,10,30,2,16,8,31,22};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(a, a.length - 1);
    }
}
