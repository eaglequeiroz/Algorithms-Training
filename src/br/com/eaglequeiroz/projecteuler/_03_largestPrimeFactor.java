package br.com.eaglequeiroz.projecteuler;


/**
 *
 * @author Igor Queiroz
 * This Algorithm is responsible for finding the largest prime factor in a given number.
 */
public class _03_largestPrimeFactor {

    public static void main(String[] args) {
        int number = 51360;
        System.out.println(largetPrimeFactor(number));
    }

    private static int largetPrimeFactor(int number) {
        int divisor = 2;
        int maxFactor = 0;

        while (number != 0){
            if(number % divisor != 0){
                divisor++;
            } else {
                maxFactor = number;
                number /= divisor;
                if (number == 1){
                    break;
                }

            }
        }

        return maxFactor;
    }
}
