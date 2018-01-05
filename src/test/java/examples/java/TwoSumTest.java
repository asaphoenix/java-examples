package examples.java;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TwoSumTest {
    @Test
    public void testTwoSum() {
        int[] input = new int[] {66, 67, 68, 6, 8, 73, 10, 75, 76, 12, 15, 17, 19, 20, 86, 87, 23, 24, 89, 90, 26, 28, 94, 95, 42, 45, 49, 52, 56, 60};
        int target = 126;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(input, target);
        System.out.println("TwoNum O(n): " + twoSum.numExec);

        assertNotNull(result);
        assertEquals(input[result[0]] + input[result[1]], target);
        System.out.println("Found two sum's elements: " + result[0] + ":" + result[1]);
    }
}
