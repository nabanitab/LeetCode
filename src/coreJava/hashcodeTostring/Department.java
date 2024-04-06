package coreJava.hashcodeTostring;

import java.util.Objects;

public class Department {
    private int id;
    private String name;
    private String company;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, company);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Department department = (Department) obj;
        return id == department.id &&
                Objects.equals(name, department.name) &&
                Objects.equals(company, department.company);
    }
}
