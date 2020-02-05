package br.com.eaglequeiroz.arrays;

/**
 * @author Igor Queiroz
 *
 * Problem:
 *
 *The greatest commom divisor (GCD), also called highest commom factor (HCF) of N number is
 * the largest positive integer that divides all numbers without giving a remainder.
 *
 * Write an algorithm to determine the GCD of N positive integers.
 *
 * Example:
 *
 * Input:
 * num = 5
 * arr = [2,4,6,8,10]
 * Output:
 * 2
 * Explanation:
 * The largest positive integer that divides all the positive integers 2,4,6,8,10 withoth a
 * remainder is 2.
 * So the output is 2.
 */
public class AmazonDemoTest02 {

    static int num = 5;
    static int[] case1 = {2,3,4,5,6};
    static int[] case2 = {2,4,6,8,10};

    public static void main(String[] args) {

        System.out.println("The GCD in case 1 is: " + generalizedGCD(num,case1));
        System.out.println("The GCD in case 2 is: " + generalizedGCD(num,case2));
    }

    static private int generalizedGCD(int num, int[] arr){

        int result = arr[0];
        for (int i = 1; i < num; i++){
            result = gcd(arr[i], result);

            if (result == 1){
                return 1;
            }
        }
        return result;
    }

    static private int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b % a, a);
    }
}
