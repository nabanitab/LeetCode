package designPattern.prototypeDesignPattern;

public class Student implements PrototypeInterface{
    int age;
    int rollNo;
    String name;

    public Student() {
    }

    public Student(int age, int rollNo, String name) {
        this.age = age;
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public PrototypeInterface clone() {
        return new Student(age,rollNo,name);
    }


}
