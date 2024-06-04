package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company {

    private String empName;

    private String empType;

    private double salary;

    public Company(String empName, String empType, double salary) {
        this.empName = empName;
        this.empType = empType;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {

       // List<Company>companies = new ("")
      //  companies.add("nabanita","")

    }
}
