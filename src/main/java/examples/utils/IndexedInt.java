package examples.utils;

public class IndexedInt implements Comparable<IndexedInt> {
    public int index;
    public int value;

    public IndexedInt(int index, int value) {
        this.index = index;
        this.value = value;
    }

    public static IndexedInt[] valueOf(int[] intArray) {
        if (intArray == null)
            return null;

        IndexedInt[] idxInts = new IndexedInt[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            idxInts[i] = new IndexedInt(i, intArray[i]);
        }
        return idxInts;
    }

    @Override
    public int compareTo(IndexedInt o) {
        return value - o.value;
    }
}
