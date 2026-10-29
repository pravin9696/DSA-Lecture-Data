class sparseMatrixDemo {
    public static void main(String[] args) {
        int[][] sp = {
                { 0, 0, 5 },
                { 0, 0, 0 },
                { 0, 8, 0 }
        };

        System.out.println("Sparse Matrix Representation:");
        for (int i = 0; i < sp.length; i++) {
            for (int j = 0; j < sp[i].length; j++) {
                System.out.print(sp[i][j] + " ");
            }
            System.out.println();
        }
    }

}