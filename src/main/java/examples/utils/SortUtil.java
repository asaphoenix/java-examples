package examples.utils;

import examples.java.TwoSum;

/**
 * Created by yewentang on 10/19/17.
 */
public class SortUtil {
    public static <T> void quickSort(Comparable[] input, int startIndex, int endIndex) {
        System.out.println("StartIndex = " + startIndex + ", endIndex = " + endIndex);
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(" " + ((TwoSum.IndexedInt)input[i]).value);
            //assertTrue(input[i].value >= input[i - 1].value);
        }
        System.out.println("");

        if (startIndex == endIndex) return;
        if (endIndex == startIndex + 1) {
            if (input[startIndex].compareTo(input[endIndex]) > 0) {
                swap(input, startIndex, endIndex);
            }
            return;
        }

        Comparable target = input[startIndex];
        int i = startIndex + 1;
        int j = endIndex;

        for(;;) {
            for (; input[i].compareTo(target) < 0; i++) ;
            for (; input[j].compareTo(target) > 0; j--) ;
            if (i < j) swap(input, i, j);
            else break;
        }
        swap(input, startIndex, i);

        quickSort(input, startIndex, i);
        quickSort(input, i + 1, endIndex);
    }

    public static void swap(Object[] array, int index1, int index2) {
        Object temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
