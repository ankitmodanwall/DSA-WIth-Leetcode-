class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int maxe = 0;
        for (int i = 0; i < arr1.length; i++) {
            maxe = Math.max(arr1[i], maxe);
        }
        int[] cnt = new int[maxe + 1];
        for (int i = 0; i < arr1.length; i++) {
            cnt[arr1[i]]++;
        }
        int[] ans = new int[arr1.length];
        int idx = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (cnt[arr2[i]] > 0) {
                ans[idx] = arr2[i];
                cnt[arr2[i]]--;
                idx++;
            }
        }
        for (int i = 0; i < cnt.length; i++) {
            while (cnt[i] > 0) {
                ans[idx] = i;
                cnt[i]--;
                idx++;
            }

        }
        return ans;
    }
}