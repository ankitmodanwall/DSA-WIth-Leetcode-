class Solution {
    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer sec_max = null;
        Integer third_max = null;

        for (int num : nums) {
            if ((max != null && num == max) || (sec_max != null && num == sec_max) || (third_max != null && num == third_max)) {
                continue;
            }

            if (max == null || num > max) {
                third_max = sec_max;
                sec_max = max;
                max = num;
            } else if (sec_max == null || num > sec_max) {
                third_max = sec_max;
                sec_max = num;
            } else if (third_max == null || num > third_max) {
                third_max = num;
            }
        }

        return third_max == null ? max : third_max;
    }
}
