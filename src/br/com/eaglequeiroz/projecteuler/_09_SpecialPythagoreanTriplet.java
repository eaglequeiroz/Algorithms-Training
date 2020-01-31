package br.com.eaglequeiroz.projecteuler;

/**
 * @author Igor Queiroz
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * <p>
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class _09_SpecialPythagoreanTriplet {

    public static void main(String[] args) {
        System.out.println("The product of the triplets which the sum is 1000 is: " + findTheTriplets1000());
    }

    private static int findTheTriplets1000() {

        for (int a = 3; a <= 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                int c = 1000 - a - b;
                if ((a * a) + (b * b) == (c * c)){
                    return a * b * c;
                }
            }
        }
        return 0;
    }
}
