import org.testng.annotations.Test;

import java.util.List;

public class SumOfAllDigitsOfANumber {


    @Test
    public void testSumOfAllNumbers() {
        sumOfAllDigits(47862);

        sumOfAllDigits(416872);

        sumOfAllDigits(5674283);

        sumOfAllDigits(475496215);

        System.out.println("----------------------------------");

        sumOfAllDigitsWithStreams(47862);

        sumOfAllDigitsWithStreams(416872);

        sumOfAllDigitsWithStreams(5674283);

        sumOfAllDigitsWithStreams(475496215);

    }

    private void sumOfAllDigits(int input) {
        System.out.println("Number: " + input);
        StringBuilder builder = new StringBuilder();
        int length = getNumberLength(input);
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int curr = input % 10;
            builder.append(curr);
            input = input / 10;
            sum += curr;
            if (i != length - 1) {
                builder.append(" + ");
            }
        }
        builder.append(" = " + sum);
        System.out.println(builder);
    }

    private void sumOfAllDigitsWithStreams(int input) {
        System.out.println("Number: " + input);
        String tmp = String.valueOf(input);
        List<Character> numbers= tmp.chars().mapToObj(x -> (char)x).toList();
        int sum = numbers.stream().map(x -> Integer.parseInt(x.toString())).reduce(0, Integer::sum);
        System.out.println("Sum = "+sum);
    }


    private int getNumberLength(int number) {
//        most simple but with huge resource cost
//        return String.valueOf(input).length();
        int length = 0;
        int tmp = 1;
        while (tmp < number) {
            length++;
            tmp *= 10;
        }
        return length;
    }
}
