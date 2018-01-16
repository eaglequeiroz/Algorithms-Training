package br.com.eaglequeiroz.multiples;

import java.math.BigInteger;

public class SelfPowers {

	public static void main(String[] args) {
		
		BigInteger calc = new BigInteger("0");
		for (int i = 1; i <= 1000; i++) {
			calc = calc.add(new BigInteger(String.valueOf(i)).pow(i));
		}
		
		String result = calc.toString();
		System.out.println("The result of the sum is: " + result.substring(result.length()-10, result.length()));

	}

}
