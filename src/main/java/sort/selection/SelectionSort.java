package sort.selection;

/**
 * Created by longcoding on 2016. 4. 21..
 */
public class SelectionSort {
    public void sort(int a[]) {

        int i, j, min;

        for(i=0; i<a.length -1; i++) {
            min = i;
            for (j=i+1; j<a.length; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            swap(a, min, i);
        }
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

class SelectionSortTest {
    public static void main(String[] args) {
        int a[] = {69, 10, 30, 2, 16, 8, 31, 22};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(a);
    }
}
