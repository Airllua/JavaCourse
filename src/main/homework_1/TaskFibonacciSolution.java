package main.homework_1;

import java.util.Arrays;

public class TaskFibonacciSolution {
    public static String solutionWithCycleFor(int n) {
        try {
            int[] resultArray = new int[n];
            resultArray[0] = 0;
            resultArray[1] = 1;

            for(int i = 1; i < n - 1; i++) {
                resultArray[i + 1] = resultArray[i - 1] + resultArray[i];
            }

            return Arrays.toString(resultArray);
        }
        catch (Exception ex) {
            return "Err";
        }
    }
    public static String solutionWithCycleWhile(int n) {
        try {
            int[] resultArray = new int[n];
            resultArray[0] = 0;
            resultArray[1] = 1;

            int i = 1;
            while (i < n - 1) {
                resultArray[i + 1] = resultArray[i - 1] + resultArray[i];
                i++;
            }

            return Arrays.toString(resultArray);
        }
        catch (Exception ex) {
            return "Err";
        }
    }
    public static String solutionWithCycleDoWhile(int n) {
        try {
            int[] resultArray = new int[n];
            resultArray[0] = 0;
            resultArray[1] = 1;

            int i = 1;
            do {
                resultArray[i + 1] = resultArray[i - 1] + resultArray[i];
                i++;
            } while(i < n - 1);

            return Arrays.toString(resultArray);
        }
        catch (Exception ex) {
            return "Err";
        }
    }

}
