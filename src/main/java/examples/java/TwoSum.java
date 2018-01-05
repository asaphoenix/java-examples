package examples.java;

import examples.utils.IndexedInt;
import examples.utils.Util;

public class TwoSum {
    public int numExec = 0;

    public int[] twoSum(int[] nums, int target) {
        System.out.println("Sum:  " + target);
        IndexedInt[] idxInts = IndexedInt.valueOf(nums);

        System.out.print("Input  = ");
        for (int i = 0; i < idxInts.length; i++) {
            System.out.print(", " + idxInts[i].value);
        }
        System.out.println("");

        Util.quickSort(idxInts, 0, idxInts.length - 1);

        System.out.print("Sorted = ");
        for (int i = 0; i < idxInts.length; i++) {
            System.out.print(", " + idxInts[i].value);
        }
        System.out.println("");
        System.out.println("Soring O(n): " + Util.numExec);

        int endIndex = idxInts.length;

        for (int i = 0; i < endIndex - 1; i++) {
            for (int j = i + 1; j < endIndex; j++) {
                numExec ++;
                System.out.println("i: " + i + ", j: " + j + ", endIndex: " + endIndex);
                int sum = idxInts[i].value + idxInts[j].value;
                if (sum == target) {
                    if (idxInts[i].index < idxInts[j].index)
                        return new int[]{idxInts[i].index, idxInts[j].index};
                    else
                        return new int[]{idxInts[j].index, idxInts[i].index};
                } else if (sum > target) {
                    endIndex = j - 1;
                    break;
                }
            }
        }

        return null;
    }
}
