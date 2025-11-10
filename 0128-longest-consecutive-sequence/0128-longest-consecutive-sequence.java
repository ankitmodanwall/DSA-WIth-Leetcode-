class Solution {
    public int longestConsecutive(int[] nums) {
       int cnt = 0;
       int mx = 0;
       Set<Integer> map = new HashSet<>();
       for(int n:nums){
        map.add(n);

       }
       for(int i:map){
        if(map.contains(i-1)){
            continue;
        }
        else{
            int c = i;
            while(true){
                if(map.contains(c)){
                    cnt++;
                    c++;

                }
                else{
                    break;
                }

            }

            if(cnt>mx){
                mx = cnt;
            }
            cnt = 0;
        }
       } 
       return mx;
    }
}