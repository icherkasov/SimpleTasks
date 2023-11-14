import org.testng.annotations.Test;

import java.util.Set;
import java.util.TreeSet;

public class CommonCharactersBetweenTwoStrings {


    @Test
    public void getCommonCharacters(){
        String firstInput = "thin sticks";
        String secondInput = "thick bricks";
        char[] firstCharArray = firstInput.replaceAll("\\s+","").toCharArray();
        char[] secondCharArray = secondInput.replaceAll("\\s+","").toCharArray();
        Set<Character> firstTreeSet = new TreeSet<>();
        Set<Character> secondTreeSet = new TreeSet<>();
        for (int i = 0; i < firstCharArray.length; i++) {
            firstTreeSet.add(firstCharArray[i]);
        }
        for (int i = 0; i < secondCharArray.length; i++) {
            secondTreeSet.add(secondCharArray[i]);
        }
        firstTreeSet.retainAll(secondTreeSet);
        System.out.println(firstTreeSet);
    }
}
