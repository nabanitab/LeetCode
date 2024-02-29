package java8;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheSumOfOddEven {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 6, 8, 9));

        int sumOfOdd = list.stream().filter(n -> n%2 !=0).mapToInt(Integer::intValue).sum();

        //  Method reference  in Java is a shorthand syntax for writing lambda expressions. It allows you to refer to
        //  methods or constructors without invoking them exp - Integer::intValue.

        int sumOfEven = list.stream().filter(n -> n%2 ==0).mapToInt(Integer::intValue).sum();

        System.out.println("sum of odd number in given string is : " +sumOfOdd);

        System.out.println("sum of even number in given string is : " +sumOfEven);
    }
}
