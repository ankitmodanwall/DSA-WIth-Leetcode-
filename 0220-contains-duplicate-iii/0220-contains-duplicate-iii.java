import java.util.*;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (indexDiff <= 0 || valueDiff < 0) return false;

        TreeSet<Long> window = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long num = (long) nums[i];

            // Find the smallest number >= num - valueDiff
            Long ceiling = window.ceiling(num - valueDiff);
            if (ceiling != null && ceiling <= num + valueDiff) {
                return true;
            }

            window.add(num);

            if (i >= indexDiff) {
                window.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}
