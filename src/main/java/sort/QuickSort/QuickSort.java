package sort.QuickSort;

/**
 * Created by longcoding on 2016. 4. 21..
 */
public class QuickSort {
    private static int i = 0;
    public int partition(int[] a, int begin, int end) {
        int pivot, temp, left, right, t;

        left = begin;
        right = end;
        pivot = (begin + end) / 2;

        System.out.println("pivot - " + a[pivot]);

        while(left < right) {
            while(!(a[left] >= a[pivot]) && !(left==right)){
                left++;
            }
            while(!(a[right] < a[pivot]) && !(left==right)){
                right--;
            }

            if (left<right) {
                temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }

        }


        temp = a[pivot];
        a[pivot] = a[right];
        a[right] = temp;

        for (t=0; t<a.length; t++) {
            System.out.printf("%3d   ", a[t]);
        }
        return right;

    }

    public void quickSort(int a[], int begin, int end) {
        if (begin < end) {
            int p;
            p = partition(a, begin, end);
            quickSort(a, begin, p - 1);
            quickSort(a, p+1, end);
        }
    }
}

class QuickSortTest {
    public static void main(String[] args) {
        int a[] = {69, 10, 30, 2, 16, 8, 31, 22};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(a, 0, a.length-1);
    }
}