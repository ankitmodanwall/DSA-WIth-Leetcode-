class Solution {
    public int lengthOfLastWord(String s) {
         int  s1 = s.length();
        s = s.trim();
        int lastspace = s.lastIndexOf(' ');
        int length = s.length() - (lastspace +1);
        return length;
    }
}