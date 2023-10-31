package main.homework_2;

import java.util.ArrayList;

public class Task_3 {
    public static ArrayList<Integer> numberLongestStringInArray(String[] arrayStr) {
        ArrayList<Integer> res = new ArrayList<>();
        int maxLength = 0;

        for (int i = 0; i < arrayStr.length; i++) {
            int currentLength = arrayStr[i].length();
            if (currentLength > maxLength) {
                maxLength = currentLength;
                res.clear();
                res.add(i);
            } else if (currentLength == maxLength) {
                res.add(i);
            }
        }

        return res;
    }
}
