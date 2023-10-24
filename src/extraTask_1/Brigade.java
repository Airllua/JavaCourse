package extraTask_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Brigade {
    private ArrayList<Employee> listEmployee;
    private HashMap<EmployeeSpecialization, Integer> brigadeCapabilities = new HashMap<>();
    Brigade(ArrayList<Employee> listEmployee) {
        this.listEmployee = new ArrayList<>(listEmployee);

        for(var specializations : EmployeeSpecialization.values()) {
            brigadeCapabilities.put(specializations, 0);
        }

        findBrigadeCapabilities();
    }

    private void findBrigadeCapabilities() {
        for(var employee: listEmployee) {
            for(var specialization : employee.getSpecialization()) {
                brigadeCapabilities.replace(specialization, brigadeCapabilities.get(specialization) + 1);
            }
        }
    }

    public HashMap<EmployeeSpecialization, Integer> getBrigadeCapabilities(){
        return brigadeCapabilities;
    }

    public double getBrigadeCost() {
        double costSum = 0;
        for(var employee : listEmployee) {
            costSum += employee.getSalary();
        }

        return costSum;
    }
}
