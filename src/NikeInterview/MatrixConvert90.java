package NikeInterview;

public class MatrixConvert90 {
    int [] [] arr= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };

    public static void rotateMatrix(int[][] arr){

        int n = arr.length;
        for(int i =0; i<n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][j];
                arr[j][i] = temp;
            }
        }

        return;
    }
}
