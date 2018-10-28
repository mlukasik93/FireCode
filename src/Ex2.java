public class Ex2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        flipItVerticalAxis(matrix);
    }

    private static void flipItVerticalAxis(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int[][] tempMatrix = new int[matrix.length][matrix[0].length];
            for (int j = 0; j < matrix[0].length; j++) {
                tempMatrix[i][j] = matrix[i][j];
            }
            if (matrix[0].length % 2 == 0) {
                for (int j = 0; j < matrix[0].length / 2; j++) {
                    matrix[i][j] = matrix[i][matrix[0].length - 1 - j];
                    System.out.print(matrix[i][j] + " ");
                }
                for (int j = matrix[0].length / 2; j < matrix[0].length; j++) {
                    matrix[i][j] = tempMatrix[i][matrix[0].length - 1 - j];
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = 0; j < matrix[0].length / 2; j++) {
                    matrix[i][j] = matrix[i][matrix[0].length - 1 - j];
                    System.out.print(matrix[i][j] + " ");
                }
                for (int j = matrix[0].length / 2; j < matrix[0].length; j++) {
                    matrix[i][j] = tempMatrix[i][matrix[0].length - 1 - j];
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
