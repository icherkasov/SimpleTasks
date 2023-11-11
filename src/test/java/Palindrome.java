import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Palindrome {


    @Test
    public void testIfWordIsPalindrome() {
        String word = "raddaR";
        assertTrue(isThisWordAPalindrome(word));
        assertTrue(isThisWordAPalindromeReverseStyle(word));
        assertTrue(isThisWordAPalindromeClassicStyle(word));
    }

    @Test
    public void testGetPalindromesLongestFirst() {
        List<String> expected = Arrays.asList("level", "Radar", "noon", "wow");
        List<String> actual = getPalindromesLongestFirst("At noon,the level on a Radar made me say wow!");
        assertEquals(expected, actual);

    }

    private List<String> getPalindromesLongestFirst(String s) {
        List<String> temp = Arrays.asList(s.replaceAll("[,.!]", " ").split(" "));
        return temp.stream().filter(this::isThisWordAPalindrome).sorted(Comparator.comparing(String::length).reversed()).toList();

    }


    private boolean isThisWordAPalindrome(String word) {
        if (word.length() < 2) {
            return false;
        }
        String temp = word.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2).allMatch(i -> temp.charAt(i) == temp.charAt(temp.length() - i - 1));

    }

    private boolean isThisWordAPalindromeClassicStyle(String word) {
        if (word.length() < 2) {
            return false;
        }
        String temp = word.replaceAll("\\s+", "").toLowerCase();
        for (int i = 0; i < temp.length() / 2; i++) {
            if (temp.charAt(i) != temp.charAt(temp.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean isThisWordAPalindromeReverseStyle(String word) {
        if (word.length() < 2) {
            return false;
        }

//        Using commons-lang3 library
//        String temp = word.replaceAll("\\s+", "").toLowerCase();
//        return StringUtils.reverse(temp).equals(temp);


        String temp = word.replaceAll("\\s+", "").toLowerCase();
        StringBuilder reverse = new StringBuilder();
        for (int i = 0; i < temp.length(); i++) {
            reverse.append(temp.charAt(temp.length() - i - 1));
        }
        System.out.println(reverse.toString());
        return temp.contentEquals(reverse);

    }
}
