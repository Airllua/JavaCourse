package test.homework_2;

import main.homework_2.Task_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_1Test {
    @Test
    void findBiggestString() {
        String expectedString = "AAAAA6";
        Assertions.assertEquals(expectedString, Task_1.findBiggestString("AA3 AAAAA6 AAA4 A2"));
    }
}