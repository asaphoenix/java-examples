package examples.utils;

public class Util {
    public static int numExec = 0;
    public static void quickSort(Comparable[] input, int startIndex, int endIndex) {
        numExec ++;

//        System.out.println("StartIndex = " + startIndex + ", endIndex = " + endIndex);
//        for (int i = 0; i < input.length; i++) {
//            System.out.print(" " + ((TwoSum.IndexedInt)input[i]).value);
//        }
//        System.out.println("");

        if (startIndex >= endIndex) return;
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
            for (; input[i].compareTo(target) < 0 && i < input.length - 1; i++) ;
            for (; input[j].compareTo(target) > 0 && j > 0; j--) ;
            if (i < j) swap(input, i, j);
            else break;
        }
        swap(input, startIndex, j);

        //System.out.println("i = " + i + ", j = " + j);
        quickSort(input, startIndex, j);
        quickSort(input, j + 1, endIndex);
    }

    /**
     * Assume sorted array <code>input</code>, search for value <code>target</code>.
     *
     * @param input
     * @param target
     * @return
     */
    public static int binarySearch(Comparable[] input, Comparable target, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            if (input[startIndex].compareTo(target) == 0)
                return startIndex;
            else
                return -1;
        }

        int middle = (startIndex + endIndex) / 2;
        if (input[middle].compareTo(target) == 0)
            return middle;

        int result = binarySearch(input, target, startIndex, middle);
        if (result < 0)
            result = binarySearch(input, target, middle + 1, endIndex);
        return result;
    }

    public static void swap(Object[] array, int index1, int index2) {
        Object temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
