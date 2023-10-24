package homework_1;

import java.util.Scanner;

public class Homework_1 {
    private static final String choiceString = """
            \nfor - 1
            while - 2
            do..while - 3
            \tChoice:\s""";

    static Scanner scanner = new Scanner(System.in);
    private static void LoopFactorial() {
        while (true) {
            System.out.print(choiceString);
            String input = scanner.nextLine();
            if (input.isEmpty()) break;

            System.out.print("\tNumber: ");

            switch (input) {
                case "1" ->
                        System.out.println(TaskFactorialSolution.
                                solutionWithCycleFor(Integer.parseInt(scanner.nextLine())));
                case "2" ->
                        System.out.println(TaskFactorialSolution.
                                solutionWithCycleWhile(Integer.parseInt(scanner.nextLine())));
                case "3" ->
                        System.out.println(TaskFactorialSolution.
                                solutionWithCycleDoWhile(Integer.parseInt(scanner.nextLine())));
                default -> { }
            }
        }
    }
    private static void LoopFibonacci() {
        while (true) {
            System.out.print(choiceString);
            String input = scanner.nextLine();
            if (input.isEmpty()) break;

            System.out.print("\tNumber: ");

            switch (input) {
                case "1" ->
                        System.out.println(TaskFibonacciSolution.
                            solutionWithCycleFor(Integer.parseInt(scanner.nextLine())));
                case "2" ->
                        System.out.println(TaskFibonacciSolution.
                                solutionWithCycleWhile(Integer.parseInt(scanner.nextLine())));
                case "3" ->
                        System.out.println(TaskFibonacciSolution.
                                solutionWithCycleDoWhile(Integer.parseInt(scanner.nextLine())));
                default -> { }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial");
        LoopFactorial();

        System.out.println("\nFibonacci");
        LoopFibonacci();
    }
}
