package br.com.eaglequeiroz.projecteuler;

import java.util.stream.LongStream;

/**
 *
 * @author Igor Queiroz
 * This Algorithm is responsible for finding the sum of the prime numbers lower than 2 million
 */
public class _10_summationOfPrimes {

    public static void main(String[] args) {
        System.out.println("The sum of the prime numbers under 2 million is: " + sumOfPrimeNumbersUnderTwoMillion());
    }

    private static long sumOfPrimeNumbersUnderTwoMillion() {
        long sum = 0;
        for (long i = 1; i <= 2000000; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        if (number % 2 == 0){
            return number == 2;
        }

        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
