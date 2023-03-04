import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};


        int[][] transpose = new int[3][3];
            int row = matrix.length;
        int col = matrix[0].length;

        int v = 8;
//        for (int r = 0; r < row; r++) {
//            for (int c = 0; c < col; c++) {
//                if (matrix[r][c] == v) {
//                    System.out.println("PRESENT");
//                    return;
//                }
//            }
//        }
//        System.out.println("ABSENT");

//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println("");
//        }

//        int sum = 0;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                sum = sum + matrix[i][j];
//            }
//        }
//        System.out.println("SUM of the elements of the matrix = " + sum);

//        for (int i = 0; i < row; i++) {
//            int start = 0;
//            int end = col - 1;
//            while (start < end) {
//                int temp = matrix[i][start];
//                matrix[i][start] = matrix[i][end];
//                matrix[i][end] = temp;
//                start++;
//                end--;
//            }
//        }

//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println("");
//        }

//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                transpose[i][j] = matrix[j][i];
//            }
//        }

//        System.out.println("Printing Matrix without transpose:");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();//new line
//        }
//        System.out.println("Printing Matrix After Transpose:");
//        for (int i = 0; i < col; i++) {
//            for (int j = 0; j < row; j++) {
//                System.out.print(matrix[j][i] + "\t");
//            }
//            System.out.println();//new line
//        }

//        int M = matrix.length, N = matrix[0].length;
//
//        int[] result = new int[M * N];
//        result[0] = matrix[0][0]; //Initialization start position
//        int i = 0, j = 0, k = 1;
//        while (k < N * M) {
//            //move up-right first
//            while (i >= 1 && j < N - 1) {
//                i--;
//                j++;
//                result[k++] = matrix[i][j];
//            }
//            //when we can't move up-right ,then move right one step
//            if (j < N - 1) {
//                j++;
//                result[k++] = matrix[i][j];
//            }
//            //if we can't move right,just move down one step
//            else if (i < M - 1) {
//                i++;
//                result[k++] = matrix[i][j];
//            }
//            //After that,we will move down-left until it can't move
//            while (i < M - 1 && j >= 1) {
//                i++;
//                j--;
//                result[k++] = matrix[i][j];
//            }
//            //if we can't move down-left,then move down
//            if (i < M - 1) {
//                i++;
//                result[k++] = matrix[i][j];
//            }
//            //if we can't move down,just move right
//            else if (j < N - 1) {
//                j++;
//                result[k++] = matrix[i][j];
//            }
//        }
//        System.out.println(Arrays.toString(result));

        int top = 0;
        int bottom = row - 1;
        int right = 0;
        int left = col - 1;
        int rowTobeSearch = 0;
        int mid = top + bottom / 2;

        while (top <= bottom) {
            if (v >= matrix[mid][0] && v <= matrix[mid][col - 1]) {
                rowTobeSearch = mid;
//                continue;
            } else if (v > matrix[mid][0]) {
                top = mid + 1;
            } else {
                bottom = mid - 1;
            }
        }

//        while (left <= right){
            if (v == matrix[rowTobeSearch][mid]) {
                System.out.println("PRESENT");
            } else if (v > matrix[rowTobeSearch][mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
//        }
        System.out.println("NOT PRESENT");
    }
}
