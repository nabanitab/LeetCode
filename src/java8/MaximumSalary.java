package java8;

import java.util.*;

public class MaximumSalary {

    public static void main(String [] args){

        List<Double> salary = Arrays.asList(60000.0,70000.0,30000.0);

        //optional class use bcz it may or may not be present any value
            Optional<Double> maxSalary = salary.stream().max(Comparator.naturalOrder());

        System.out.println("Max salary: " + maxSalary);
        }


    }

