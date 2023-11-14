import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumbers {


    @Test
    public void checkNumberIsPrime() {
        int number = 35;
        boolean isPrime = isItPrimeNumber(number);
        if (isPrime) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }

    @Test
    public void generateAmountOfPrimes() {
        int amount = 20;
        List<Integer> primes = new ArrayList<>();
        int cursor = 2;
        while (primes.size() < amount) {
        if(isItPrimeNumber(cursor)){
            primes.add(cursor);
        }
        cursor++;
        }
        System.out.println(primes);
    }

    @Test
    public void findAllPrimesBetween(){
        int start = 100;
        int end = 150;
        List<Integer> primes = new ArrayList<>();

        for (int i = start; i<end;i++){
            if(isItPrimeNumber(i)){
                primes.add(i);
            }
        }

        System.out.println(primes);
    }

    private boolean isItPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }
        if (number > 1 && number <= 3) {
            return true;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
