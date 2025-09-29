import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int cand1 = 0;
        int cand2 = 0;

        int count1 = 0;
        int count2 = 0;

        for (int num : nums) {
            if (num == cand1) {
                count1++;
            } else if (num == cand2) {
                count2++;
            } else if (count1 == 0) {
                cand1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                cand2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        int count11 = 0;
        int count22 = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {

            if (nums[i] == cand1)
                count11++;

            else if (nums[i] == cand2)
                count22++;
        }
        // Add to result if they appear more than n/3 times

        if (count11 > len / 3) {
            ans.add(cand1);
        }
        if (count22 > len / 3) {
            ans.add(cand2);
        }
        return ans;
    }
}