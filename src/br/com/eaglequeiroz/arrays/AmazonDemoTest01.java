package br.com.eaglequeiroz.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Igor Queiroz
 * <p>
 * Problem:
 * <p>
 * Eight houses, represented as cells, are arranged in a straight line. Each day every cell competes
 * with its adjacent cells (neighbors). An integer value of 1 represents an active cell and a value of
 * 0 represents an inactive cell. If the neighbors on both the sides of a cell are either active or
 * inactive, the cell becomes inactive on the next day; otherwise the cell becomes active. The two
 * cells on each end have a single adjacent cell, so assume that the unoccupied space on the
 * opposite side is an inactive cell. Even after updating the cell state, consider its previous state
 * when updating the state of other cells. The state information of a cells should be updated
 * simultaneously.
 * <p>
 * Write an algorithm to output the state of the cells after the given number of days.
 */
public class AmazonDemoTest01 {

    static int[] input1 = {1, 0, 0, 0, 0, 1, 0, 0};
    static int[] input2 = {1, 1, 1, 0, 1, 1, 1, 1};
    static int days1 = 1;
    static int days2 = 2;

    public static void main(String[] args) {

        System.out.println("The output for the test 1 is: " + cellCompete(input1, days1));
        System.out.println("The output for the test 2 is: " + cellCompete(input2, days2));
    }

    static public List<Integer> cellCompete(int[] states, int days) {
        // WRITE YOUR CODE HERE
        List<Integer> currentStates = new ArrayList<>();
        for (int i = 1; i <= days; i++) {
            currentStates.clear();
            for (int j = 0; j < 8; j++) {
                if (j != 0 && j != 7) {
                    currentStates.add(states[j - 1] == states[j + 1] ? 0 : 1);
                } else if (j == 0) {
                    currentStates.add(0 == states[j + 1] ? 0 : 1);
                } else {
                    currentStates.add(0 == states[j - 1] ? 0 : 1);
                    for (int index = 0; index < 8; index++) {
                        states[index] = currentStates.get(index);
                    }
                }

            }
        }

        return currentStates;
    }
}
