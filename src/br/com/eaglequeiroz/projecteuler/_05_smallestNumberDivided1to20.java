package br.com.eaglequeiroz.projecteuler;

/**
 *
 * @author Igor Queiroz
 * This Algorithm is responsible for finding the smallest number that can be divided for 1 to 20 without remainder.
 */
public class _05_smallestNumberDivided1to20 {

    public static void main(String[] args) {
        System.out.println("The Smallest Number divided for 1 to 10 is: " + smallestNumber());
    }

    private static long smallestNumber() {
        for (int smallest = 1;;smallest++){
            for (int j = 20; j >= 1; j-- ){
                if (smallest % j != 0){
                    break;
                } else if(j == 1) {
                    return smallest;
                }
            }
        }
    }
}
