package sort.merge;

/**
 * Created by longcoding on 2016. 4. 21..
 */
public class MyMergeSort {
    public void merge(int[] data, int startPoint, int endPoint, int middlePoint) {

        int temp, j;
        for (int middlePivot = middlePoint + 1; middlePivot <= endPoint; middlePivot++) {
            temp = data[middlePivot];
            j = middlePivot;
            while ((j>0) && (data[j-1] > temp)) {
                data[j] = data[j-1];
                j--;
            }
            data[j] = temp;
        }

        for(int k=0; k < data.length; k++) {
            System.out.printf("%3d  ", data[k]);
        }

    }

    public void sort(int[] data, int startPoint, int endPoint) {
        int middlePoint;
        if (startPoint < endPoint) {
            middlePoint = (startPoint + endPoint) / 2;
            sort(data, startPoint, middlePoint);
            sort(data, middlePoint+1, endPoint);
            merge(data, startPoint, endPoint, middlePoint);
            System.out.println();
        }
    }
}

class MyMergeSortTest {
    public static void main(String[] args) {
        int a[] = {69, 10, 30, 2, 16, 8, 31, 22};

        MyMergeSort myMergeSort = new MyMergeSort();
        myMergeSort.sort(a, 0, a.length - 1);

    }
}
