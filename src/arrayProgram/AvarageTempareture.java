package arrayProgram;

import java.util.Arrays;

public class AvarageTempareture {
    public static void main(String[] args) {
        int[] temperatures = {28, 25, 27, 30, 32, 29, 26};

        // Calculate the average temperature
        double averageTemperature = calculateAverage(temperatures);

        System.out.println("Weekly Temperature Report:");
        System.out.println(Arrays.toString(temperatures));
        System.out.println("Average Temperature: " + averageTemperature + " Celsius");
    }

    private static double calculateAverage(int[] temperatures) {
        int sum = 0;

        // Calculate the sum of temperatures
        for (int temperature : temperatures) {
            sum += temperature;
        }

        // Calculate the average
        return (double) sum / temperatures.length;
    }
}

