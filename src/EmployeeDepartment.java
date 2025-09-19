public class EmployeeDepartment {
    public int EmployeeId;

    public String EmplyeeName;

    public String Department;

    public Double Salary;

    public EmployeeDepartment(int employeeId, String emplyeeName, String department, Double salary) {
        EmployeeId = employeeId;
        EmplyeeName = emplyeeName;
        Department = department;
        Salary = salary;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public String getEmplyeeName() {
        return EmplyeeName;
    }

    public String getDepartment() {
        return Department;
    }

    public Double getSalary() {
        return Salary;
    }
}
