package test.homework_2;

import main.homework_2.Task_6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_6Test {
    @Test
    void substringReplacement() {
        String testingString = "one two three";
        String testingSubstring = "two";
        String testingNewSubstring = "four";

        Assertions.assertEquals("one four three",
                Task_6.substringReplacement(testingString, testingSubstring, testingNewSubstring));
    }
}