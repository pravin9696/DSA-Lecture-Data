public class CreateSparseMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 0, 5 },
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 8, 0 }
        };

        System.out.println("Sparse Matrix Representation:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }

        // count total number of non-zero elements in given matrix
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    count++;
                }
            }
        }
        // create a sparse matrix with 3 rows and count columns
        int[][] sm = new int[count][3]; // Sparse Matrix
        // fill the sparse matrix with non-zero elements and their positions
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    sm[k][0] = i; // row index
                    sm[k][1] = j; // column index
                    sm[k][2] = matrix[i][j]; // value
                    k++;
                }
            }
        }
        // display the sparse matrix
        System.out.println("Sparse Matrix Representation:");
        for (int i = 0; i < sm.length; i++) {
            // System.out.println(" "+sm[i][0] + " " + sm[i][1] + " " + sm[i][2]);
            System.out.printf("%3d %3d %3d\n", sm[i][0], sm[i][1], sm[i][2]);
        }
    }
}
