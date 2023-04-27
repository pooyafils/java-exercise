package interview;

import java.util.Arrays;

public class MaxDiffBetweenTwoElementsMain {
    //MaxDiffBetweenTwoElements of array
    public static void main(String[] args) {
        int[] integers = {4, 2, 8, 3, 8, 2, 6, 7, 9, 9,9};

        int md = MaxDiffBetweenTwoElements.maxDiff(integers);
        System.out.println("Max diff: " + md);
    }
}
