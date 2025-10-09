class Solution {
    public void swap(int[]arr, int a , int b ){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public int[] sortArrayByParityII(int[] nums) {
        int evenidx = 0;
        int oddidx= 1;
        int n = nums.length;
        while(evenidx<n && oddidx<n){
        if(nums[evenidx]%2==1  && nums[oddidx]%2== 0){
            swap(nums,evenidx,oddidx);

        }  
        if(nums[evenidx]%2==0) evenidx+=2;
        if(nums[oddidx]%2==1)oddidx+=2;      
    }
    return nums;
}}