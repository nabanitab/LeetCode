package string;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int num = left; num <= right; num++) {
            if (isSelfDividing(num)) {
                result.add(num);
            }
        }
        return result;
    }

    private boolean isSelfDividing(int num) {
        int originalNum = num;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0 || originalNum % digit != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        SelfDividingNumbers selfDividingNumbers = new SelfDividingNumbers();

        // Example 1
        int left1 = 1, right1 = 22;
        System.out.println("Output 1: " + selfDividingNumbers.selfDividingNumbers(left1, right1));

        // Example 2
        int left2 = 47, right2 = 85;
        System.out.println("Output 2: " + selfDividingNumbers.selfDividingNumbers(left2, right2));
    }
}

