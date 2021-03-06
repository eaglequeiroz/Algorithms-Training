package br.com.eaglequeiroz.projecteuler;

/**
 *
 * @author Igor Queiroz
 * This Algorithm is responsible for iterate a Fibonacci sequence till it reaches the positive number closer to 4000000;
 * It prints on the console the number of iterations, the last number close to 4000000 and the sum of all even Fibonacci numbers.
 */
public class _02_evenFibonacciNumbers {

    static Long evenFiboNumbersSum = 2l;
    static int iLoop = 0;
    static Long fibo(Long fibonacciNumber){
        if (fibonacciNumber == 0){
            return 0l;
        }
        else if( fibonacciNumber == 1){
            return 1l;
        }
        else {
            Long penult = 0l;
            Long last = 1l;
            Long current = 0l;
            for (int i = 2; i < fibonacciNumber; i++){
                if(penult + last > 4000000) break;
                iLoop = i;
                current = penult + last;
                if(current % 2 == 0) evenFiboNumbersSum += current;
                penult = last;
                last = current;
            }
            return current;
        }
    }
    public static void main(String args[]) {
        Long result = fibo(100l);
        System.out.println("The Fibonacci sequence ends when the " + iLoop + " element is reached and its value is: " + result);
        System.out.println("The sum of the even Fibonacci Numbers is: " + evenFiboNumbersSum);
    }
}
