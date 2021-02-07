package JavaCore;

/**
 * Created by pooya on 4/18/2020.
 */
public class InsertionSort {
    public static void insertionSort(int[] list) {

        for (int i = 1; i < list.length; i++) {
            /** Insert list[i] into a sorted sublist list[0..i-1] so that
             list[0..i] is sorted. */
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                //  < for big to less
                list[k + 1] = list[k];
                list[k] = currentElement;
            }

        }

    }

    public static void main(String args[]) {
        int[] list = {1, -1, -2};
       InsertionSort .insertionSort(list);

        System.out.println("After Insertion Sort");
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}


