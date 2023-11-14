import org.testng.annotations.Test;

import java.util.Arrays;

public class MinimumAbsoluteDifferenceBetweenTwoElementsOfArray {

    @Test
    public void getMinimumDifference(){
        minimumAbsoluteDifference(new int[] {5, 8, 4, 2, 9, 0});

        System.out.println("==========================");

        minimumAbsoluteDifference(new int[] {45, -89, 12, -62, 31, -57});

        System.out.println("==========================");

        minimumAbsoluteDifference(new int[] {5, -3, 7, -2});
    }


    private void minimumAbsoluteDifference(int[] inputArray){
        System.out.println(Arrays.toString(inputArray));
        int minimum = Integer.MAX_VALUE;
        int firstVal = inputArray[0];
        int secondVal = inputArray[1];

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i+1; j < inputArray.length; j++) {
                if(Math.abs(inputArray[i]-inputArray[j])< minimum){
                    firstVal = inputArray[i];
                    secondVal = inputArray[j];
                    minimum =Math.abs(inputArray[i]-inputArray[j]);
                }
            }
        }
        System.out.println("Minimum: "+minimum);
        System.out.println("For values: "+firstVal+ " and "+secondVal);
    }
}
