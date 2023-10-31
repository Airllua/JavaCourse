package test.homework_2;

import main.homework_2.Task_5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_5Test {
    @Test
    void amountWordsInString() {
        String testString = "one two three";
        Assertions.assertEquals(3, Task_5.amountWordsInString(testString));
    }
}