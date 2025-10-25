class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder s1 =  new StringBuilder();
       for(char i :s.toCharArray()){
        if(Character.isLetterOrDigit(i)){
            s1.append(Character.toLowerCase(i));
        }
       }
        int l = 0, r = s1.length()-1;
        while(l<r){
            if(s1.charAt(l++) != s1.charAt(r--)) return false;
        }
        return true;
    }
}