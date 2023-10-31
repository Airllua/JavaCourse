package main.homework_1;

import java.util.Arrays;

public class TaskFactorialSolution {
    public static String solutionWithCycleFor(int n) {
        int[] resultArray = new int[n];
        resultArray[0] = 1;

        for(int i = 1; i < n; i++) {
            resultArray[i] = resultArray[i - 1] * (i + 1);
        }

        return Arrays.toString(resultArray);
    }
    public static String solutionWithCycleWhile(int n) {
        int[] resultArray = new int[n];
        resultArray[0] = 1;

        int i = 1;
        while(i < n) {
            resultArray[i] = resultArray[i - 1] * ++i;
        }

        return Arrays.toString(resultArray);
    }
    public static String solutionWithCycleDoWhile(int n) {
        int[] resultArray = new int[n];
        resultArray[0] = 1;

        int i = 1;
        do {
            resultArray[i] = resultArray[i - 1] * ++i;
        } while(i < n);

        return Arrays.toString(resultArray);
    }
}
