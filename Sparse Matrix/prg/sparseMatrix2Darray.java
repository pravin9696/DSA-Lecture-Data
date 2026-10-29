class sparseMatrix2Darray {
    public static void main(String[] args) {
        /*
         * int[][] sp = {
         * { 0, 0, 5 },
         * { 0, 0, 0 },
         * { 0, 8, 0 }
         * };
         */

        int[][] sp = {
                { 0, 2, 5 },
                { 2, 1, 8 }
        };
        System.out.println("Sparse Matrix Representation:");
        for (int i = 0; i < sp.length; i++) {

            System.out.println(sp[i][0] + " " + sp[i][1] + " " + sp[i][2]);
        }
    }

}