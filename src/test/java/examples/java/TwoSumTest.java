package examples.java;

import examples.utils.NumUtil;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void testSort() {
        int TEST_NUM = 20;
        TwoSum.IndexedInt[] input = new TwoSum.IndexedInt[TEST_NUM];
        Integer[] randomInts = NumUtil.randomNumbersWithoutRepetition(427, 50, TEST_NUM);
        System.out.print("Random Integers:");
        for (int i = 0; i < TEST_NUM; i++) {
            input[i] = new TwoSum().new IndexedInt(i, randomInts[i]);
            System.out.print(" " + input[i].value);
        }
        System.out.println();

        TwoSum twoSum = new TwoSum();
        twoSum.sort(input);

        System.out.print("Sorted integers: " + input[0].value);
        for (int i = 1; i < input.length; i++) {
            System.out.print(" " + input[i].value);
            //assertTrue(input[i].value >= input[i - 1].value);
        }
        System.out.println();
    }
}
