import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HarshadNivenNumber {
//    Harshad or Niven number is a number that can be divided by sum of its digits
//    153 -> 1+5+3= 9 -> 153/9= 17 -> 153%9= 0   PASSED
//    71 -> 7+1= 8 -> 71/8= 8.875 -> 71%8= 0.875 FAILED


    @Test
    public void checkIfHarshadNivenNumer() {
        int number = 71;
        List<Integer> digits = splitIntToDigits(number);
        System.out.println("Digits: " + digits);
        Integer sum = digits.stream().reduce(0, Integer::sum);
        System.out.println(number + " / " + sum + " = " + (double) number / sum);
        if (number % sum != 0) {
            System.out.println("Not Harshad (Niven) number");
        } else {
            System.out.println("Found Harshad (Niven) number");
        }

    }

    private List<Integer> splitIntToDigits(int number) {
        List<Integer> digits = new ArrayList<>();
        if (number < 10) {
            digits.add(number);
            return digits;
        }
        while (number != 0) {
            digits.add(number % 10);
            number = number / 10;
        }
        return digits.reversed();
    }
}
