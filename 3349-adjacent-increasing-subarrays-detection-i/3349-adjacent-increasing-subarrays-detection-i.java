class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
 int ans = k-1;
 if(ans==0) return true;
 for(int j = k+1; j<nums.size(); j++){
    if(nums.get(j) > nums.get(j-1) && nums.get(j-k) > nums.get(j-k-1)){
        ans--;
    }
    else {
        ans = k-1;
    }
    if(ans==0)return true;
 }
return false;
    }
}