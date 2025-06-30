class Solution {
    public List<List<Integer>> generate(int numRows) {
// This will store the all rows in p-triangle
        List<List<Integer>> triangle = new ArrayList<>();

// each row from 0 to -n
        for (int row = 0; row < numRows; row++) {

            List<Integer> currRow = new ArrayList<>();
            long ans = 1;
            currRow.add(1);


            for (int col = 1; col <= row; col++) {
                ans = ans * (row - col + 1);
                ans = ans / col;

                currRow.add((int) ans);

            }
            triangle.add(currRow);

        }
        return triangle;
    }
}