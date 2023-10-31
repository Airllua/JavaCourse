package test.extraTask_1;

import main.extraTask_1.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BrigadeTest {
    private Brigade brigade;
    @BeforeEach
    void setUp() {
        Employee employee1 = new Employee(new EmployeeSpecialization[]{EmployeeSpecialization.MILLING,
                EmployeeSpecialization.PLASTERER},150.0);
        Employee employee2 = new Employee(new EmployeeSpecialization[]{EmployeeSpecialization.MILLING},
                120.0);
        Employee employee3 = new Employee(new EmployeeSpecialization[]{EmployeeSpecialization.PAINTER},
                100.0);

        brigade = new Brigade(new ArrayList<>(List.of(employee1, employee2, employee3)));
    }
    @org.junit.jupiter.api.Test
    void findBrigadeCapabilities() {
        HashMap<EmployeeSpecialization, Integer> expectedHashMap = new HashMap<>();
        expectedHashMap.put(EmployeeSpecialization.PAINTER, 1);
        expectedHashMap.put(EmployeeSpecialization.MILLING, 2);
        expectedHashMap.put(EmployeeSpecialization.PLASTERER, 1);

        Assertions.assertEquals(expectedHashMap, brigade.getBrigadeCapabilities());
    }

    @org.junit.jupiter.api.Test
    void getBrigadeCost() {
        Assertions.assertEquals(370, brigade.getBrigadeCost());
    }
}