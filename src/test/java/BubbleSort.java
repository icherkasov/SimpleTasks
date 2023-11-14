import org.testng.annotations.Test;

import java.util.Arrays;

public class BubbleSort {

    @Test
    public void checkBubbleSort() {
        int[] inputArray = new int[]{7, 4, 9, 2, 5};

        System.out.println("Input Array : " + Arrays.toString(inputArray));

        int[] sortedArray = bubbleSort(inputArray);

        System.out.println("Sorted Array : " + Arrays.toString(sortedArray));
    }

    private int[] bubbleSort(int[] inputArray) {
        int temp;
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = 0; j < inputArray.length - i - 1; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }

            }
        }
        return inputArray;
    }
}

