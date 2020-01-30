package br.com.eaglequeiroz.projecteuler;

/**
 *
 * @author Igor Queiroz
 * This Algorithm is responsible for finding the largest palindrome number by the product of two 3 digits numbers.
 */
public class _04_largestPalindromeProduct {

    public static void main(String[] args) {
        int x = 999, y = 999;
        System.out.println("The Largest Palindrome is: " + largestPalindrome(x,y));
    }

    private static long largestPalindrome(int x, int y) {
        long largestPalindrome = 0;
        for (int i = x; i > 0; i--){
            for (int j = y; j > 0; j--){
                if(isPalindrome(i*j)){
                    if(i*j > largestPalindrome){
                        largestPalindrome = i*j;
                    }
                }
            }
        }
        return largestPalindrome;
    }

    private static boolean isPalindrome(long multiplication) {
        String result = Long.toString(multiplication);
        return result.equals(new StringBuilder(result).reverse().toString());
    }
}
