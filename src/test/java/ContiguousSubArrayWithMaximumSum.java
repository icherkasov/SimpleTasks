import org.testng.annotations.Test;

import java.util.Arrays;

public class ContiguousSubArrayWithMaximumSum {

    @Test
    public void getSubArrayWithMaxSum(){
        int[] input = new int[] {2, -3, 7, -4, 2, 5, -8, 6, -1};

        int bestSum = input[0];
        int bestStart = 0;
        int bestEnd = 0;
        int currentSum = 0;
        int currentStart = 0;

        for (int i = 0; i < input.length; i++) {
            currentSum = currentSum + input[i];
            if(currentSum <0){
                currentSum = 0;
                currentStart = i+1;
            }
            if(currentSum > bestSum){
                bestSum = currentSum;
                bestStart = currentStart;
                bestEnd = i;
            }

        }
        System.out.println("Input Array : "+ Arrays.toString(input));

        System.out.print("Continous Sub Array With Maximum Sum : ");

        System.out.print("[ ");

        for (int i = bestStart; i <= bestEnd; i++)
        {
            System.out.print(input[i]+" ");
        }

        System.out.print("]");

        System.out.println();

        System.out.println("Sum : "+bestSum);

    }
}
