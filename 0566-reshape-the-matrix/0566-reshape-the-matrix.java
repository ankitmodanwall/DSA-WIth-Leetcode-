class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;

        if((row*col) != (r*c)) return mat;

        int[][] mat1 = new int[r][c];
        int mat1_row = 0;
        int mat1_col = 0;

        for(int i =0; i<row; i++){
            for(int j = 0; j<col; j++)
            {
                mat1[mat1_row][mat1_col] = mat[i][j];
                mat1_col++;
            if(mat1_col==c)
            {
                mat1_col = 0;
                mat1_row++;
            }
            }

        }
        return mat1;
    }
}