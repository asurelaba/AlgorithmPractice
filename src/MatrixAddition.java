public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix1 = {{2, 1}, {5, 2}};
        int[][] matrix2 = {{1, 4}, {3, 6}};

        for (int i = 0; i < matrix1.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix2.length; j++) {
                System.out.print((matrix1[i][j] + matrix2[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
