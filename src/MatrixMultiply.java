public class MatrixMultiply {
    public static void main(String[] args) {
        int[][] matrix1 = {{2, 1}, {5, 2}};
        int[][] matrix2 = {{1, 4}, {3, 6}};

        // could write logic to check if no. of columns in matrix1 is equal to no. of rows in matrix2

        for (int[] row : matrix1) {
            for (int i = 0; i < row.length; i++) {
                int sum = 0;
                for (int j = 0; j < matrix2.length; j++) {
                    sum += row[j] * matrix2[j][i];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
