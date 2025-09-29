class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean[] arr = new boolean[nums.length + 1];
        int[] res = { 0, 0 };
        for (int num : nums) {
            if (arr[num] == true)
                res[0] = num;

            else
                arr[num] = true;
        }
        for (int i = 1; i <= nums.length; i++) {

            if (arr[i] == false) {
                res[1] = i;
                break;
            }
        }
        return res;
    }
}