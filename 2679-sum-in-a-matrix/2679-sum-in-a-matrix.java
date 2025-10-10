class Solution {
    public int matrixSum(int[][] nums) {

        for (int[] row : nums) {
            Arrays.sort(row);
        }
        int score = 0;
        for (int i = 0; i < nums[0].length; i++) {
            int max = nums[0][i];
            for (int j = 0; j < nums.length; j++) {
                if (nums[j][i] > max) {
                    max = nums[j][i];
                }
            }
            score += max;
        }

        return score;

    }
}