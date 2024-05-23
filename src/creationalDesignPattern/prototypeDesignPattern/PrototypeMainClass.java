package creationalDesignPattern.prototypeDesignPattern;

public class PrototypeMainClass {
    public static void main(String[] args) {
        Student obj = new Student(20, 1, "nabanita");
        Student clonedObj = (Student) obj.clone();
        System.out.println(clonedObj);
    }
}
