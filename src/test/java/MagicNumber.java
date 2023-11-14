import org.testng.annotations.Test;

public class MagicNumber {
//    Magic number is a number which gives sum exactly 1 when its digits are recursively added
//    1252 -> 1 + 2 + 5 + 2 = 10 -> 1 + 0 = 1


    @Test
    public void checkMagicNumber() {
        int inputNumber = 1252;
        System.out.println("Checking number: "+inputNumber);
        int sum = 0;
        while (sum > 9 || inputNumber > 0) {
            if (inputNumber == 0) {
                inputNumber = sum;
                sum = 0;
            }
            int lastDigit = inputNumber % 10;
            sum = sum + lastDigit;
            inputNumber = inputNumber / 10;
        }
        if(sum>1){
            System.out.println("Not a magic number");
        }else {
            System.out.println("Magic number");
        }
    }
}
