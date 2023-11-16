package string;

class ColumnDeletionChecker {
    public int minDeletionSize(String[] strs) {
        int columnsToDelete = 0;

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j - 1].charAt(i) > strs[j].charAt(i)) {
                    columnsToDelete++;
                    break;
                }
            }
        }

        return columnsToDelete;
    }

    public static void main(String[] args) {
        ColumnDeletionChecker deletionChecker = new ColumnDeletionChecker();

        // Test cases
        System.out.println(deletionChecker.minDeletionSize(new String[]{"cba", "daf", "ghi"})); // Output: 1
        System.out.println(deletionChecker.minDeletionSize(new String[]{"a", "b"})); // Output: 0
        System.out.println(deletionChecker.minDeletionSize(new String[]{"zyx", "wvu", "tsr"})); // Output: 3
    }
}
