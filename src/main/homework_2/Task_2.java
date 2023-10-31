package main.homework_2;

public class Task_2 {
    public static String removingExtraSpaces(String str) {
        return str.trim().replaceAll("\\s+", " ");
    }
}
