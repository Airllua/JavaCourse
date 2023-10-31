package test.homework_2;

import main.homework_2.Task_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task_3Test {
    @Test
    void numberOneLongestStringInArray() {
        String[] arrayStrings = new String[] {"A2", "AA3", "AAA4", "AAAA5"};
        Assertions.assertEquals(new ArrayList<Integer>(List.of(3)),
                Task_3.numberLongestStringInArray(arrayStrings));
    }

    @Test
    void numberTwoLongestStringInArray() {
        String[] arrayStrings = new String[] {"A2", "AA3", "AAA4", "AAAA5", "BBBB5"};
        Assertions.assertEquals(new ArrayList<Integer>(List.of(3, 4)),
                Task_3.numberLongestStringInArray(arrayStrings));
    }
}