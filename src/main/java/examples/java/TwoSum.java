package examples.java;

import examples.utils.SortUtil;

public class TwoSum {
    public class IndexedInt implements Comparable<IndexedInt> {
        public int index;
        public int value;

        IndexedInt(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(IndexedInt o) {
            return value - o.value;
        }
    }

    public int[] twoSum(int[] nums, int target) {
        IndexedInt[] idxInts = new IndexedInt[nums.length];
        for (int i = 0; i < nums.length; i++) {
            idxInts[i] = new IndexedInt(i, nums[i]);
        }

        sort(idxInts);
        for (int i = 0; i < idxInts.length - 1; i++) {
            IndexedInt secondInt = findSecond(idxInts, i + 1, target - idxInts[i].value);
            if (secondInt != null)
                return new int[] {idxInts[i].index, secondInt.index};
        }

        return null;
    }

    public void sort(IndexedInt[] nums) {
        SortUtil.quickSort(nums, 0, nums.length - 1);
    }

    private IndexedInt findSecond(IndexedInt[] nums, int startIndex, int value) {
        if (startIndex == nums.length - 1) {
            //if (nums[startIndex].value == value)
        }
        return null;
    }
}
