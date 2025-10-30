class Solution {
    public int repeatedStringMatch(String a, String b) {
        
        String temp = a;
        int repeat = 1;
        while(temp.length() <b.length()){
            temp += a;
            repeat++;
        } 
        if(temp.contains(b)) return repeat;
        if((temp +a).contains(b))return repeat +1;

return -1;
    }
}