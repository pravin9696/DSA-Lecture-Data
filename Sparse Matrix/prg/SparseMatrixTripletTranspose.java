public class SparseMatrixTripletTranspose {
    public static void main(String[] args) {
        // int[][] matrix = {
        // { 0, 0, 5 },
        // { 0, 0, 0 },
        // { 0, 8, 0 }
        // };
        int[][] tp = new int[][] {
                { 0, 2, 5 },
                { 2, 1, 8 }
        };
        int[][] tsp = new int[tp.length][3];
        for (int i = 0; i < tp.length; i++) {
            {
                tsp[i][0] = tp[i][1]; // row index
                tsp[i][1] = tp[i][0]; // column index
                tsp[i][2] = tp[i][2]; // value
            }
        }
        // display the transposed sparse matrix
        System.out.println("Transposed Sparse Matrix Representation:");
        for (int i = 0; i < tsp.length; i++) {
            System.out.printf("%3d %3d %3d\n", tsp[i][0], tsp[i][1], tsp[i][2]);
        }
    }
}
