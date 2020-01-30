package br.com.eaglequeiroz.projecteuler;

import java.util.stream.LongStream;

/**
 *
 * @author Igor Queiroz
 * This Algorithm is responsible for calculate the difference between
 * the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class _06_differenceBetweenSumSquares {

    public static void main(String[] args) {
        int oneHundred = 100;
        System.out.println(
                "The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is: "
                        + sumSquareDifference(oneHundred));
    }

    private static long sumSquareDifference(int oneHundred) {

        long sumOfSquares = LongStream.range(1, oneHundred).map(value -> value *= value).sum();
        long squareOfSum = LongStream.range(1, oneHundred).sum() * LongStream.range(1, oneHundred).sum();

        return squareOfSum - sumOfSquares;
    }
}
