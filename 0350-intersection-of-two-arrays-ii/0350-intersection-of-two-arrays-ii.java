class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int N = nums1.length;
        int M = nums2.length;
        //initialize two ptr
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while (p1 < N && p2 < M) {
            if (nums1[p1] < nums2[p2]) {
                p1++;
            }

            else if (nums1[p1] > nums2[p2]) {
                p2++;

            } else {
                nums1[p3++] = nums1[p1++];
                p2++;
            }
        }

        return Arrays.copyOfRange(nums1, 0, p3);
    }
}