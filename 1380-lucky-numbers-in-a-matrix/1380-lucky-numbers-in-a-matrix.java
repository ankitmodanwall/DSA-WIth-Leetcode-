import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[] row_min = new int[row];
        Arrays.fill(row_min, Integer.MAX_VALUE);
        int[] col_max = new int[col];

        for(int i = 0; i<row;++i){
            for(int j = 0; j<col; ++j){
            int ele = matrix[i][j];
            row_min[i] = Math.min(row_min[i],ele);
            col_max[j] = Math.max(col_max[j],ele);

        }}
 for(int i = 0; i<row;++i){
            for(int j = 0; j<col; ++j){
                    int ele = matrix[i][j];
                    if(ele == row_min[i] && ele == col_max[j])
    {
        return Collections.singletonList(ele);

    }}
 }
        return Collections.emptyList();
 }
}