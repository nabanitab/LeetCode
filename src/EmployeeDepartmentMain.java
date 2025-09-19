import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class EmployeeDepartmentMain {
    public static void main(String[] args) {
        List<EmployeeDepartment> employees = new ArrayList<>();

        employees.add(new EmployeeDepartment(1, "Nabanita", "Java", 3000.0));
        employees.add(new EmployeeDepartment(2, "Sus", "HR", 4000.0));
        employees.add(new EmployeeDepartment(3, "Raj", "Java", 6000.0));
        employees.add(new EmployeeDepartment(4, "Amit", "HR", 8000.0));
        employees.add(new EmployeeDepartment(5, "Neha", "Testing", 5000.0));

        // Step 1: Group by Department and calculate average salary
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        EmployeeDepartment::getDepartment,
                        Collectors.averagingDouble(EmployeeDepartment::getSalary)
                ));

        System.out.println("Average Salary by Department: " + avgSalaryByDept);

        // Step 2: Find department with maximum average salary
        Map.Entry<String, Double> maxAvgDept = avgSalaryByDept.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        if (maxAvgDept != null) {
            System.out.println("Department paying Max Avg Salary: " +
                    maxAvgDept.getKey() + " (Avg Salary = " + maxAvgDept.getValue() + ")");
        }
    }
}
