package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeListDemoExample {
    public static void main(String[] args) {
        EmployeeList e1=new EmployeeList("Raj",123);
        EmployeeList e2=new EmployeeList("Baabi",623);
        EmployeeList e3=new EmployeeList("Aarav",1231);
        EmployeeList e4=new EmployeeList("Anuj",12113);
        EmployeeList e5=new EmployeeList("Ravi",1223);

        List<EmployeeList> l=new ArrayList();
        l.add(e1);
        l.add(e2);
        l.add(e3);
        l.add(e4);
        l.add(e5);

        Collections.sort(l,new EmpNameCompare());
        System.out.println(l);
        Collections.sort(l,new EmpIDCompare());
        System.out.println(l);
    }
}
