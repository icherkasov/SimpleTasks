import org.testng.annotations.Test;

import java.util.HashMap;

public class ContigousSubArrayWithGivenSum {


    @Test
    public void getContigousSubArrayWithGivenSum() {
        hashingMethod(new int[]{2, 4, 2, 8, 3, 3, 2, -4, 12}, 8);

        System.out.println("=====================================");

        hashingMethod(new int[]{5, -9, 4, -2, 7, 1, -4, -3, -7}, -7);

        System.out.println("=====================================");

        hashingMethod(new int[]{7, 3, 6, 5, 21, -6, -15, 28, 8}, 21);
    }

    private void hashingMethod(int[] inputArray, int givenSum) {

        int currentSum = 0;
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
//        adding starting value, cause if given sum will start from first element of inputArray
//        like sum is 8 and array first values are 2;2;4
//        difference between given and current sums will be 0
//        so we need to point at inputArray[0] as starting point
//        so key is 0 for difference checking
//        and value is -1 to pass 0 as starting point in printSubArray()
        sumIndexMap.put(0, -1);
        for (int i = 0; i < inputArray.length; i++) {
            currentSum = currentSum + inputArray[i];
            if (sumIndexMap.containsKey(currentSum - givenSum)) {
                printSubArray(inputArray, sumIndexMap.get(currentSum - givenSum) + 1, i);
            }
            sumIndexMap.put(currentSum, i);
        }

    }


    private static void printSubArray(int[] inputArray, int start, int end) {
        System.out.print("[");

        for (int i = start; i <= end; i++) {
            System.out.print(" " + inputArray[i]);
        }

        System.out.println(" ]");
    }
}



