package interview;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {


        ArrayList<Employee> arrayList = new ArrayList<>();

        Employee employee1 = new Employee(1L, "nabo");
        Employee employee2 = new Employee(3L, "d");

        arrayList.add(employee1);
        arrayList.add(employee2);

        for (Employee emp : arrayList){
            System.out.println(emp);
        }


    }

}
