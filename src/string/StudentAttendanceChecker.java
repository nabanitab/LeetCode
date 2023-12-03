package string;

public class StudentAttendanceChecker {
    public boolean checkRecord(String s) {
        int absentCount = 0;
        int lateCount = 0;

        for (char c : s.toCharArray()) {
            if (c == 'A') {
                absentCount++;
                lateCount = 0; // Reset late count when absent
            } else if (c == 'L') {
                lateCount++;
            } else {
                lateCount = 0; // Reset late count when present
            }

            if (absentCount >= 2 || lateCount >= 3) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        StudentAttendanceChecker attendanceChecker = new StudentAttendanceChecker();

        // Example 1
        String s1 = "PPALLP";
        System.out.println("Output 1: " + attendanceChecker.checkRecord(s1));

        // Example 2
        String s2 = "PPALLL";
        System.out.println("Output 2: " + attendanceChecker.checkRecord(s2));
    }
}

