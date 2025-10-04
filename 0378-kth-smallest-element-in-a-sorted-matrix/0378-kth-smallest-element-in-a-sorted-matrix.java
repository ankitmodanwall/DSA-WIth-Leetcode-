import java.util.PriorityQueue;
import java.util.Comparator;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = -1;

        // Min-heap storing {value, row, column}
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));

        // Step 1: Insert first element of each row (up to k rows) into the heap
        for (int row = 0; row < Math.min(m, k); ++row) {
            minHeap.offer(new int[] { matrix[row][0], row, 0 });
        }

        // Step 2: Extract min k times
        for (int i = 0; i < k; ++i) {
            int[] top = minHeap.poll();
            int val = top[0];
            int row = top[1];
            int col = top[2];

            ans = val;

            // If there's a next column in the same row, add it to the heap
            if (col + 1 < n) {
                minHeap.offer(new int[] { matrix[row][col + 1], row, col + 1 });
            }
        }

        return ans;
    }
}
