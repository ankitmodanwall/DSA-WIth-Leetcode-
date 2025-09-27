class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> hm = new HashMap<>();
        int i = 0;
        for (int num : nums) {
            if (hm.containsKey(num)) {
                int pastidx = hm.get(num);
                if (i - pastidx <= k) {
                    return true;
                }
            }
            hm.put(num, i);
            i++;

        }
        return false;
    }
}