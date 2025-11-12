import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }

        int i = 0;
        while (i < nums.length) {
            int start = nums[i];
            int j = i;
            while (j + 1 < nums.length && nums[j + 1] == nums[j] + 1) {
                j++;
            }

            if (nums[j] == start) {
                res.add(String.valueOf(start));
            } else {
                res.add(start + "->" + nums[j]);
            }

            i = j + 1;
        }

        return res;
    }
}
