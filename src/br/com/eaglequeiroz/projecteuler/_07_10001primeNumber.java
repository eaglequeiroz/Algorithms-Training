package br.com.eaglequeiroz.projecteuler;

import java.util.stream.LongStream;

/**
 *
 * @author Igor Queiroz
 * This Algorithm is responsible for finding the 10001st prime number
 */
public class _07_10001primeNumber {

    public static void main(String[] args) {
        System.out.println("The 1001st prime number is: " + _10001PrimeNumber());
    }

    private static long _10001PrimeNumber() {
        long _10001primeNumberCounter = 0;
        for (long i = 1; _10001primeNumberCounter <= 10001 ; i++) {
            if (isPrime(i)) {
                _10001primeNumberCounter++;
                if (_10001primeNumberCounter == 10001){
                    return i;
                }
            }
        }
        return 0;
    }

    private static boolean isPrime(long number) {
        return number > 1 && LongStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }
}
