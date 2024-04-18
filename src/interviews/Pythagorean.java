package interviews;

public class Pythagorean {

        //{5,7,9,3,2,4};
        //a^2 + b^2 = c^2(This is call Pythagorean theorem)

        public static void main(String[] args) {
            int arr[] = {5, 7, 9, 3, 2, 4};

            int a2 = 0;
            int b2 = 0;

            for (int i = 0; i < arr.length; i++) {
                a2 = arr[i]; // Assume the first element as a^2
                for (int j = 0; j < arr.length; j++) {
                    b2 = arr[j]; // Assume the second element as b^2
                    int c2 = a2 + b2; // Calculate c^2
                    if (isInArray(c2, arr)) { // Check if c^2 exists in the array
                        System.out.println("Found: " + a2 + " + " + b2 + " = " + c2);
                    }
                }
            }
        }

        public static boolean isInArray(int num, int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    return true;
                }
            }
            return false;
        }
    }


