import org.testng.annotations.Test;

public class FibonacciCheck {

    @Test
    public void checkIfFibonacci(){
        int input = 59;
        //boolean res = isFibonacciSimple(input);
       boolean res = isfibonacciPerfectSquare(input);

        if (res){
            System.out.println(input + " is Finbonacci");
        }else {
            System.out.println(input + " is not Finbonacci");
        }
    }

public boolean isFibonacciSimple(int n){
    int firstTerm = 0;
    int secondTerm = 1;
    int thirdTerm = 0;

    while(n > thirdTerm){
        thirdTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = thirdTerm;
    }
    return n == thirdTerm;
}


    static boolean isPerfectSq(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }
    static boolean isfibonacciPerfectSquare(int n) {
        // if (5 * n^2 + 4) or (5 * n^2 - 4) is a perfect square then it is a fibonacci number
        return isPerfectSq(5 * n * n - 4) || isPerfectSq(5 * n * n + 4);
    }
}
