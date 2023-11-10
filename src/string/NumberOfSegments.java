package string;

//Given a string s, return the number of segments in the string.
//
//A segment is defined to be a contiguous sequence of non-space characters.
public class NumberOfSegments {

        public int countSegments(String s) {
            if (s == null || s.trim().isEmpty()) {
                return 0;
            }

            String[] segments = s.trim().split("\\s+");
            return segments.length;
        }

        public static void main(String[] args) {
            NumberOfSegments solution = new NumberOfSegments();

            // Test cases
            String test1 = "Hello, my name is John";
            System.out.println(solution.countSegments(test1));  // Output: 5

            String test2 = "Hello";
            System.out.println(solution.countSegments(test2));  // Output: 1

            String test3 = "   "; // Multiple spaces
            System.out.println(solution.countSegments(test3));  // Output: 0
        }
    }






