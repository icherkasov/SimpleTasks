import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicatesInString {


    @Test
    public void testStringForDuplicatesLetters() {
        List<String> inputData = Arrays.asList("JavaJ2EE", "Fresh Fish", "Better Butter");
        inputData.stream().forEach(x -> printDuplicateResultsForWord(x));

    }

    private void printDuplicateResultsForWord(String data) {
        char[] splitData = data.toCharArray();
        HashMap<Character, Integer> valuesAmount = new HashMap<>();
        for (char key : splitData) {
            if (valuesAmount.containsKey(key)) {
                valuesAmount.put(key, valuesAmount.get(key) + 1);
            } else {
                valuesAmount.put(key, 1);
            }
        }
        Map<Character, Integer> duplicatesOnly = valuesAmount.entrySet().stream().filter(x -> x.getValue() != 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(data);
        duplicatesOnly.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
