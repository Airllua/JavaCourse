package homework_2;


public class Task_4 {
    public static class ResInfo {
        public int amountLowercaseChars = 0;
        public int amountAppercaseChars = 0;

        @Override
        public String toString() {
            return String.format("lowercase - %d, uppercase - %d", amountLowercaseChars, amountAppercaseChars);
        }
    }

    public static ResInfo findAmountLoweAndUpperChars(String str) {
        ResInfo resInfo = new ResInfo();

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
                if (character >= 'a') {
                    resInfo.amountLowercaseChars++;
                }
                else {
                    resInfo.amountAppercaseChars++;
                }
            }
        }

        return resInfo;
    }
}
