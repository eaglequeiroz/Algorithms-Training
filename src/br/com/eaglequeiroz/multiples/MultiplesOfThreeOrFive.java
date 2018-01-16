package br.com.eaglequeiroz.multiples;

public class MultiplesOfThreeOrFive {

	public static void main(String[] args) {
		
		int sumOfThreeOrFive = 0;
		
		for (int i = 0; i < 1000; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sumOfThreeOrFive += i;
			}
		}
		
		System.out.println("The sum of the multiples of 3 or 5 is: " + sumOfThreeOrFive);

	}

}
