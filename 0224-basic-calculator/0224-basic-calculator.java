class Solution {
    public int calculate(String s) {
        Stack<Integer>stack  = new Stack<>();
        int res = 0;
        int num = 0;
        int sign = 1;
        for(int i = 0; i<s.length(); i++){
            char s1 = s.charAt(i);
            if(Character.isDigit(s1)){
                num = 10 * num + (int)(s1 - '0');
            }
            else if(s1 == '+'){
                res += sign * num;
                num = 0;
                sign = 1;
            }
            else if(s1 == '-'){
                res += sign * num;
                num = 0;
                sign = -1;
            }
            else if (s1 == '('){
                stack.push(res);
                stack.push(sign);
                sign = 1;
                res = 0;
            }
            else if (s1 == ')'){
                res += sign * num;
                num = 0;
                res *= stack.pop();
                res += stack.pop();
            }
        } 
        if(num != 0) res += sign * num;
        return res;
}
    }