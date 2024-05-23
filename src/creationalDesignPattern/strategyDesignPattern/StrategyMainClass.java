package creationalDesignPattern.strategyDesignPattern;

// Define the strategy interface
interface SortingStrategy {
    void sort(int[] array);
}

// Define concrete sorting strategy classes
class BubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        // Implement bubble sort algorithm
        System.out.println("Sorting array using Bubble Sort");
    }
}

class QuickSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        // Implement quick sort algorithm
        System.out.println("Sorting array using Quick Sort");
    }
}

// Context class that uses the strategy
class Sorter {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] array) {
        strategy.sort(array);
    }
}

// Usage example
public class StrategyMainClass {
    public static void main(String[] args) {
        // Create a context object
        Sorter sorter = new Sorter();

        // Use bubble sort strategy
        sorter.setStrategy(new BubbleSort());
        int[] array1 = {5, 2, 7, 1, 8};
        sorter.sortArray(array1);

        // Use quick sort strategy
        sorter.setStrategy(new QuickSort());
        int[] array2 = {9, 4, 3, 6, 0};
        sorter.sortArray(array2);
    }
}

