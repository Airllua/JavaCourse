package main.homework_2;

public class Task_1 {
    public static String findBiggestString(String str) {
        int maxStrLength = 0;
        String resString = "";

        for(var el: str.split(" ")) {
            if(el.length() > maxStrLength) {
                maxStrLength = el.length();
                resString = el;
            }
        }

        return resString;
    }
}
