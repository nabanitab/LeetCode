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


    @Override
    public String toString() {
        return "EmployeeDepartment{" +
                "EmployeeId=" + EmployeeId +
                ", EmplyeeName='" + EmplyeeName + '\'' +
                ", Department='" + Department + '\'' +
                ", Salary=" + Salary +
                '}';
    }

}
