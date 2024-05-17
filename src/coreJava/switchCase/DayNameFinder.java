package coreJava.switchCase;

import java.util.Scanner;

public class DayNameFinder {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of the day (1-7): ");

        int day = scanner.nextInt();

        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;

            case 2:
                dayName = "Tuesday";
                break;

            case 3:
                dayName = "Wednesday";
                break;

            case 4:
                dayName = "Thursday";
                break;

            case 5:
                dayName = "Friday";
                break;

            case 6:
                dayName = "Saturday";
                break;

            case 7:
                dayName = "Sunday";
                break;

            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("The name of the day is: " + dayName);

        scanner.close();
    }
}
