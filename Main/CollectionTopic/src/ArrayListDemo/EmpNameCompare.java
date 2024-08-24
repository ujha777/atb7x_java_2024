package ArrayListDemo;

import java.util.Comparator;

public class EmpNameCompare implements Comparator<EmployeeList> {

    @Override
    public int compare(EmployeeList o1, EmployeeList o2) {
        return o1.getEmp_name().compareTo(o2.getEmp_name());
    }
}
