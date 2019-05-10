package br.com.eaglequeiroz.arrays;

import java.util.HashSet;

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

	private static int solution(int[] A) {
		int result = 1;
		HashSet<Integer> setList = new HashSet<>();

		for (int i : A) {
			setList.add(A[i]);
		}

		while (setList.contains(result)) {
			result++;
		}

		return result;
	}
	
	public static void main(String[] args) {

		int[] A = {1, 3, 6, 4, 1, 2};
		int[] B = {1, 2, 3};
		int[] C = {-1, -2};
		
		System.out.println(solution(A));
		System.out.println(solution(B));
		System.out.println(solution(C));

	}

}
