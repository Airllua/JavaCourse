package main.homework_2;


public class Task_4 {

    public static int[] findAmountLoweAndUpperChars(String str) {
        int amountLowercaseChars = 0;
        int amountAppercaseChars = 0;

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
                if (character >= 'a') {
                    amountLowercaseChars++;
                }
                else {
                    amountAppercaseChars++;
                }
            }
        }

        return new int[] {amountLowercaseChars, amountAppercaseChars};
    }
}
