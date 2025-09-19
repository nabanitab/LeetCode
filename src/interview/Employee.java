package interview;

public class Employee {

    private Long EmpId;

    private String EmpName;

    public Employee(Long EmpId,String EmpName ){
        this.EmpId = EmpId;
        this.EmpName = EmpName;
    }

    public Employee(int i, String nabanita, String java, int i1) {
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public Long getEmpId() {
        return EmpId;
    }

    public void setEmpId(Long empId) {
        EmpId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpId=" + EmpId +
                ", EmpName='" + EmpName + '\'' +
                '}';
    }


}
