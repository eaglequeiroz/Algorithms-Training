package br.com.eaglequeiroz.projecteuler;

/**
 * @author Igor Queiroz
 * This Algorithm is responsible for finding the first triangle number to have over 500 divisors
 * <p>
 * ******
 * The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
 * <p>
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * <p>
 * Let us list the factors of the first seven triangle numbers:
 * <p>
 * 1: 1
 * 3: 1,3
 * 6: 1,2,3,6
 * 10: 1,2,5,10
 * 15: 1,3,5,15
 * 21: 1,3,7,21
 * 28: 1,2,4,7,14,28
 * We can see that 28 is the first triangle number to have over five divisors.
 * <p>
 * What is the value of the first triangle number to have over five hundred divisors?
 * <p>
 * ******
 */
public class _12_highlyDivisibleTriangularNumber {

    static int maxCount = 500;

    public static void main(String[] args) {

        double startTime = System.currentTimeMillis();
        long result = findTriangleNumberWithOver500Divisors();
        double endTime = System.currentTimeMillis();

        System.out.println("The Triangle number to have over 500 divisors is: " + result);
        System.out.println("Took " + ((endTime - startTime) / 1000) + " seconds");
    }

    private static long findTriangleNumberWithOver500Divisors() {
        long n = 1;
        while (countDivisors((n + 1) / 2) * countDivisors(n) <= maxCount) {
            n++;
            if (countDivisors(n / 2) * countDivisors(n + 1) > maxCount) {
                break;
            }
            n++;
        }

        return n * (n + 1) / 2;
    }

    private static long countDivisors(long number) {
        long divisorCount = 0;

        int i = 1;
        while (i * i < number) {
            if (number % i == 0) {
                divisorCount += 2;
            }

            i++;
        }

        if (i * i == number) {
            divisorCount++;
        }

        return divisorCount;
    }
}
