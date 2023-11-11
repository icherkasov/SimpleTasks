import org.testng.annotations.Test;

import java.util.LinkedHashMap;

public class LongestSubstringWithoutRepeatingCharacters {


    @Test
    public void testLongest() {
        String input = "javaconceptoftheday";

        String longestSequence = null;
        int longestLength = 0;

        char[] charArray = input.toCharArray();

        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<>();

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (!charPosMap.containsKey(ch)) {
                charPosMap.put(ch, i);
            } else {
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
            if(longestLength < charPosMap.size()) {
                longestLength = charPosMap.size();
                longestSequence = charPosMap.keySet().toString();
            }
        }

        System.out.println(longestSequence);
    }
}
