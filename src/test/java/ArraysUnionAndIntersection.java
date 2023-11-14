import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;

public class ArraysUnionAndIntersection {


    @Test
    public void checkArraysUnion() {
        int[] inputArray1 = {2, 3, 4, 7, 1};

        int[] inputArray2 = {4, 1, 3, 5};

        int[] inputArray3 = {8, 4, 6, 2, 1};

        int[] inputArray4 = {7, 9, 4, 1};

        union(inputArray1, inputArray2, inputArray3, inputArray4);
    }

    @Test
    public void checkArraysIntersection() {
        Integer[] inputArray1 = {2, 3, 4, 7, 1};

        Integer[] inputArray2 = {4, 1, 3, 5};

        Integer[] inputArray3 = {8, 4, 6, 2, 1};

        Integer[] inputArray4 = {7, 9, 4, 1};

        intersection(inputArray1, inputArray2, inputArray3, inputArray4);
    }

    private void intersection(Integer[]... inputArrays) {
        HashSet<Integer> intersection = new HashSet<>(Arrays.asList(inputArrays[0]));

        for (int i = 1; i < inputArrays.length; i++) {
            HashSet<Integer> set = new HashSet<>(Arrays.asList(inputArrays[i]));
            intersection.retainAll(set);
        }

        System.out.println(intersection);
    }

    private void union(int[]... inputArrays) {
        HashSet<Integer> union = new HashSet<>();

        for (int[] inputArray : inputArrays) {
            for (int i : inputArray) {
                union.add(i);
            }
        }

        System.out.println(union);
    }
}
