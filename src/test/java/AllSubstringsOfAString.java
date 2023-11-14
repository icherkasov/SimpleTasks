import org.testng.annotations.Test;

public class AllSubstringsOfAString {
    @Test
    public void getAllSubStringsOfAString(){
        String inputString = "Java";
        for (int i = 0; i < inputString.length(); i++) {
            StringBuilder build = new StringBuilder();
            build.append(inputString.charAt(i));
            System.out.println(build);
            for (int j = i+1; j < inputString.length(); j++) {
                build.append(inputString.charAt(j));
                System.out.println(build);
            }
        }

    }
}
