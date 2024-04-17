package java8;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class SecondHighestSalary {

        public static void main(String[] args) {
            List<Double> salaries = Arrays.asList(50000.0, 75000.0, 60000.0, 80000.0, 70000.0);

            double secondHighestSalary = salaries.stream()
                    .sorted(Comparator.reverseOrder())
                    .skip(1)
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Not enough salaries"));

            System.out.println("Second highest salary: " + secondHighestSalary);
        }
    }


