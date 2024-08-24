package ArrayListDemo;

import java.util.Comparator;

public class EmpIDCompare implements Comparator<EmployeeList> {

    @Override
    public int compare(EmployeeList o1, EmployeeList o2) {
        return Integer.compare(o1.getEmp_id(),o2.getEmp_id());
    }
}
