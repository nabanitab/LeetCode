package string;

import java.util.Scanner;

//You are given a simple Java program that checks whether a given string represents a valid number. Review the program and answer the following questions:
public class ValidNumber {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            if (isValidNumber(input)) {
                System.out.println("The input is a valid number.");
            } else {
                System.out.println("The input is not a valid number.");
            }

            scanner.close();
        }

        public static boolean isValidNumber(String s) {
            // Check if the string is null or empty
            if (s == null || s.isEmpty()) {
                return false;
            }

            // Check for optional sign
            int i = 0;
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                i++;
            }

            boolean hasDigit = false;

            // Check for digits (integer part)
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                i++;
                hasDigit = true;
            }

            // Check for optional decimal part
            if (i < s.length() && s.charAt(i) == '.') {
                i++;

                // Check for one or more digits in the decimal part
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    i++;
                    hasDigit = true;
                }
            }

            // Check for optional exponential part
            if (hasDigit && i < s.length() && (s.charAt(i) == 'e' || s.charAt(i) == 'E')) {
                i++;

                // Check for optional sign in the exponential part
                if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                    i++;
                }

                boolean hasExponentialDigit = false;

                // Check for one or more digits in the exponential part
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    i++;
                    hasExponentialDigit = true;
                }

                // Check if at least one digit is present in the exponential part
                if (!hasExponentialDigit) {
                    return false;
                }
            }

            // Check if the entire string has been processed
            return i == s.length();
        }
    }

