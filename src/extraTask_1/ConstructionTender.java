package extraTask_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ConstructionTender {
    private ArrayList<Brigade> brigades = new ArrayList<Brigade>();
    public ArrayList<Brigade> getBrigades() {
        return brigades;
    }

    ConstructionTender(ArrayList<Brigade> brigades) {
        this.brigades = brigades;
    }

    public void brigadesAdd(ArrayList<Employee> listEmployee) {
        brigades.add(new Brigade(listEmployee));
    }

    public Double findBestBrigadeCost(HashMap<EmployeeSpecialization, Integer> necessaryBrigadeCapabilities) {
        ArrayList<Double> brigadeCosts = new ArrayList<>();

        for(var brigade : brigades) {
            HashMap<EmployeeSpecialization, Integer> brigadeCapabilities = brigade.getBrigadeCapabilities();

            boolean isBregadeSatisfy = true;
            for(Map.Entry<EmployeeSpecialization, Integer> item: necessaryBrigadeCapabilities.entrySet()) {
                if(item.getValue() > brigadeCapabilities.get(item.getKey())) {
                    isBregadeSatisfy = false;
                    break;
                }
            }

            if(isBregadeSatisfy) {
                brigadeCosts.add(brigade.getBrigadeCost());
            }
        }

        return Collections.min(brigadeCosts);
    }

    public static void main(String[] args) {
    }
}
