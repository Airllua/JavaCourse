package test.homework_2;

import main.homework_2.Task_1;
import main.homework_2.Task_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_2Test {
    @Test
    void removingExtraSpaces() {
        String expectedString = "AA3 AAAAA6 AAA4 A2";
        Assertions.assertEquals(expectedString, Task_2.removingExtraSpaces("AA3    AAAAA6        AAA4      A2"));
    }
}