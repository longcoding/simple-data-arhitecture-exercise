package sort.bubble;

/**
 * Created by longcoding on 2016. 4. 21..
 */
public class BubbleSort {
    public void sort(int[] a) {
        int i, j, temp, size;
        size = a.length;

        for (i=size-1; i>0; i--) {
            for (j=0; j<i; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            for (int k=0; k<size; k++){
                System.out.printf("%3d  ", a[k]);
            }
            System.out.println();

        }
    }
}

class BubbleSortTest {
    public static void main(String[] args) {
        int a[] = {69, 10, 30, 2, 16, 8, 31, 22};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(a);
    }
}
