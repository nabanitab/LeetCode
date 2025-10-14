package meeee;

import java.util.List;

public class AllJava8EmployeeQuestion {

    public static void main(String[] args) {

        List<Employee>list = List.of(new Employee("nabanita",27,"java",85000),
        new Employee("Susmita",24,"law",100000)
        ,new Employee("Tuhin",24,"CS",100000),
                new Employee("rekha",27,"java",75000),
                new Employee("monalisha",21,"law",35000));
        //1.salary greater than 50000

        list.stream()
                .filter(e -> e.getSalary() > 50000)
                .forEach(System.out::println);

        //2️⃣ Find all employees who work in the “java” department.

        list.stream().filter(Employee-> Employee.getDepartment().equalsIgnoreCase("java")).forEach(System.out::println);

        //🔹 3️⃣ Find employees whose names start with “A”.

        list.stream().filter(Employee-> Employee.getName().startsWith("r")).forEach(System.out::println);

        //🔹 4️⃣ Find employees older than 25 years.

        list.stream().filter(Employee-> Employee.getAge()>25).forEach(System.out::println);

        //🔹 5️⃣ Get all distinct departments from the employee list.

        list.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

    }
}
