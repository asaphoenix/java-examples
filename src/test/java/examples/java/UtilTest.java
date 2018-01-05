package examples.java;

import examples.utils.IndexedInt;
import examples.utils.NumUtil;
import examples.utils.Util;
import org.junit.Before;
import org.junit.Test;

public class UtilTest {
    private IndexedInt[] input;
    private static int RANDOM_NUM_RANGE = 100;

    @Before
    public void setUp() {
        int TEST_NUM = 30;
        input = new IndexedInt[TEST_NUM];
        Integer[] randomInts = NumUtil.randomNumbersWithoutRepetition((int)System.currentTimeMillis(), RANDOM_NUM_RANGE, TEST_NUM);
        System.out.print("Random Integers:");
        for (int i = 0; i < TEST_NUM; i++) {
            input[i] = new IndexedInt(i, randomInts[i]);
            System.out.print(" " + input[i].value);
        }
        System.out.println();
    }

    @Test
    public void testSort() {
        Util.quickSort(input, 0, input.length - 1);

        System.out.print("Sorted integers: " + input[0].value);
        for (int i = 1; i < input.length; i++) {
            System.out.print(", " + input[i].value);
        }
        System.out.println();
        System.out.println("Num of Exec: " + Util.numExec);
    }

    @Test
    public void testBinarySearch() {
        int[] input = new int[] {6, 8, 10, 12, 15, 17, 19, 20, 23, 24, 26, 28, 42, 45, 49, 52, 56, 60, 66, 67, 68, 73, 75, 76, 86, 87, 89, 90, 94, 95};
        IndexedInt[] idxInts = IndexedInt.valueOf(input);
        int foundIndex = Util.binarySearch(idxInts, new IndexedInt(-2, 20), 0, 29);
        System.out.println("Found Index: " + foundIndex);
    }
}
