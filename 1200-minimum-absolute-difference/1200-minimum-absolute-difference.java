class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 1 ; i<arr.length; i++){
            min_diff = Math.min(arr[i]-arr[i-1], min_diff);

        }
        for(int i = 1; i<arr.length; i++){
            if(arr[i] - arr[i-1] ==  min_diff ){
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                res.add(pair);
            }
        }
        return res;
    }
}