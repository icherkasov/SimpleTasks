import org.testng.annotations.Test;

import java.util.Arrays;

public class AnagramCheck {

    @Test
    public void testIfStringsAreAnagrams(){

        isAnagram("Mother In Law", "Hitler Woman");

        isAnagram("keEp", "peeK");

        isAnagram("SiLeNt CAT", "LisTen AcT");

        isAnagram("Debit Card", "Bad Credit");

        isAnagram("School MASTER", "The ClassROOM");

        isAnagram("DORMITORY", "Dirty Room");

        isAnagram("ASTRONOMERS", "NO MORE STARS");

        isAnagram("Toss", "Shot");

        isAnagram("joy", "enjoy");
    }

    private void isAnagram(String first, String second) {
        System.out.println(first +" : "+ second);
        char[] firstByChar = first.replaceAll("\\s+","").toLowerCase().toCharArray();
        char[] secondByChar = second.replaceAll("\\s+","").toLowerCase().toCharArray();
        if(firstByChar.length == secondByChar.length){
            Arrays.sort(firstByChar);
            Arrays.sort(secondByChar);
            if(Arrays.equals(firstByChar, secondByChar)){
                System.out.println("Anagram detected");
            } else {
                System.out.println("Not anagram");
            }
        }
        else {
            System.out.println("Not anagram");
        }

    }
}
