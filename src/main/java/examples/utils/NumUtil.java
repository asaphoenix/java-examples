package examples.utils;

import java.util.HashSet;
import java.util.Random;

/**
 * Created by yewentang on 8/17/17.
 */
public class NumUtil {
    public static Integer[] randomNumbersWithoutRepetition(int seed, int range, int count) {
        Random rng = new Random(seed);
        HashSet<Integer> randomNumSet = new HashSet<Integer>();
        while(randomNumSet.size() < count) {
            randomNumSet.add(rng.nextInt(range));
        }
        Integer[] ints = new Integer[count];
        return randomNumSet.toArray(ints);
    }
}
