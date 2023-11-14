import org.testng.annotations.Test;

public class PronicNumber {
//      Pronic number is a number which is the product of two consecutive integers i.e n(n+1)
//      For example:
//      12 = 3 x 4
//      20 = 4 x 5
//      56 = 7 x 8
//      They are also called Oblong numbers or Heteromecic numbers.

    @Test
    public void checkIfNumberPronic() {
        pronicCheckIterative(342);
        pronicCheckIterative(1406);
        pronicCheckIterative(979);
        System.out.println("========================");
        pronicCheckWithSQRT(342);
        pronicCheckWithSQRT(1406);
        pronicCheckWithSQRT(979);

    }

    //This method uses the property of pronic numbers
    //which states that if n is a pronic number then sqrt(n) * (sqrt(n)+1) = n.

    private void pronicCheckWithSQRT(int input) {
        int squareRoot = (int) Math.sqrt(input);
        if(squareRoot*(squareRoot+1) == input){
            System.out.println(input + " is a pronic number");
            System.out.println("Square root of "+input + " is "+squareRoot);
            System.out.println(squareRoot +" x "+(squareRoot+1) + " = "+ input);
        }else {
            System.out.println(input + " is not a pronic number");
        }
    }

    private void pronicCheckIterative(int input) {
        boolean pronic = false;
        for (int i = 0; i < input; i++) {
            if (i * (i + 1) == input) {
                System.out.println(input + " is pronic");
                System.out.println(i + " x " + (i + 1) + " = " + input);
                pronic = true;
                break;
            }
        }
        if (!pronic) {
            System.out.println(input + " is not pronic");
        }

    }

}
