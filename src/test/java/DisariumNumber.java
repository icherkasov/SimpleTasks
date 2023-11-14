import org.testng.annotations.Test;

public class DisariumNumber {
//    A number is said to be Disarium if it is equal to sum of its digits raised to the power of their respective position in the number.
//    For example, 135 is a Disarium number. Because, it is equal to sum of its digits raised to the power of their respective position.
//    135 = 11 + 32 + 53
//    135 = 1 + 9 + 125
//    135 = 135



    @Test
    public void checkDisariumNumber(){
        int inputNumber = 135;
        int inputNumberCopy = inputNumber;
        System.out.println("Input number: "+inputNumber);
        Integer noOfDigits = String.valueOf(inputNumber).length();
        int sum = 0;
        while(inputNumber >0){
            int lastDigit = inputNumber%10;
            sum  = (int) (sum + Math.pow(lastDigit, noOfDigits));
            noOfDigits--;
            inputNumber /=10;
        }
        if(sum == inputNumberCopy){
            System.out.println("is Disarium number");
        }else {
            System.out.println("is not Disarium number");
        }
    }
}
