package test.homework_2;

import main.homework_2.Task_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_4Test {
    @Test
    void findAmountLoweAndUpperChars() {
        String testingString = "AAAAAAAAAA bbbbbbbb";
        Assertions.assertArrayEquals(new int[] {8, 10}, Task_4.findAmountLoweAndUpperChars(testingString));
    }
}