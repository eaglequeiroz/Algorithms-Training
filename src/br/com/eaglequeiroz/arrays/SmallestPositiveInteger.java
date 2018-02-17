package br.com.eaglequeiroz.arrays;

import java.util.Arrays;

/*
* Write a function:
*
* class Solution { public int solution(int[] A); }
*
* that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
*
* For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
*
* Given A = [1, 2, 3], the function should return 4.
*
* Given A = [−1, −3], the function should return 1.
*
* Assume that:
*
* N is an integer within the range [1..100,000];
* each element of array A is an integer within the range [−1,000,000..1,000,000].
* Complexity:
*
* expected worst-case time complexity is O(N);
* expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
* 
*/

public class SmallestPositiveInteger {

	static int solution(int[] A) {
		Arrays.sort(A);
		
		for (int i = 0; i < A.length; i++) {
			if(A[i] > 0 && i != A.length && A[i+1] != A[i] + 1) {
				return A[i] + 1;
			} else if(i == A.length) {
				return A[i] +1;
			}
		}
		
		return 1;
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		
		System.out.println(SmallestPositiveInteger.solution(a));

	}

}
