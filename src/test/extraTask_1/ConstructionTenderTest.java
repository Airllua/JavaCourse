package test.extraTask_1;

import  main.extraTask_1.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ConstructionTenderTest {
    ConstructionTender tender;
    @BeforeEach
    void setUp() {
        Employee employee1 = new Employee(new EmployeeSpecialization[]{EmployeeSpecialization.MILLING,
                EmployeeSpecialization.PLASTERER},150.0);
        Employee employee2 = new Employee(new EmployeeSpecialization[]{EmployeeSpecialization.MILLING},
                120.0);
        Employee employee3 = new Employee(new EmployeeSpecialization[]{EmployeeSpecialization.PAINTER},
                100.0);

        Brigade brigade1 = new Brigade(new ArrayList<>(List.of(employee1, employee2, employee3)));

        Employee employee4 = new Employee(new EmployeeSpecialization[]{EmployeeSpecialization.MILLING,
                EmployeeSpecialization.PLASTERER},170.0);
        Employee employee5 = new Employee(new EmployeeSpecialization[]{EmployeeSpecialization.MILLING},
                100.0);
        Employee employee6 = new Employee(new EmployeeSpecialization[]{EmployeeSpecialization.PAINTER},
                90.0);

        Brigade brigade2 = new Brigade(new ArrayList<>(List.of(employee4, employee5, employee6)));

        tender = new ConstructionTender(new ArrayList<>(List.of(brigade1, brigade2)));
    }

    @Test
    void findBestBrigadeCost() {
        HashMap<EmployeeSpecialization, Integer> capability = new HashMap<>();
        capability.put(EmployeeSpecialization.PAINTER, 1);
        capability.put(EmployeeSpecialization.MILLING, 2);
        capability.put(EmployeeSpecialization.PLASTERER, 1);

        Assertions.assertEquals(360.0, tender.findBestBrigadeCost(capability));
    }
}