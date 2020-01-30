package br.com.eaglequeiroz.projecteuler;

import java.util.stream.IntStream;

/**
 *
 * @author Igor Queiroz
 * This Algorithm is responsible for iterate a Integer value from 0 to itself and sum all the values that are
 * multiple of 3 or 5.
 */

public class _01_multiplesOf3and5 {

    static int sum = 0;

    public static int getMultiplesOf3or5Sum(Integer number) {
        return IntStream.range(0, number).filter(currentNumber -> currentNumber % 3 == 0 || currentNumber % 5 == 0).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        Integer _1000 = 1000;
        System.out.println(getMultiplesOf3or5Sum(_1000));
    }
}
