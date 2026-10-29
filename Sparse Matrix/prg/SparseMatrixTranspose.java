public class SparseMatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 0, 5 },
                { 0, 0, 0 },
                { 0, 8, 0 }
        };
        int[][] tsp = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                tsp[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transposed Matrix Representation:");
        for (int i = 0; i < tsp.length; i++) {
            for (int j = 0; j < tsp[i].length; j++) {
                System.out.print(" " + tsp[i][j] + " ");
            }
            System.out.println();
        }

    }
}
