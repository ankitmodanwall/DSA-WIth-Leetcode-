class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] pos = new int[m + n]; // array to store intermediate results

        // multiply each digit and add to the corresponding positions
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + pos[p2];

                pos[p1] += sum / 10;  // carry
                pos[p2] = sum % 10;   // remainder
            }
        }

        // convert the array to a string
        StringBuilder sb = new StringBuilder();
        for (int p : pos) {
            if (!(sb.length() == 0 && p == 0)) { // skip leading zeros
                sb.append(p);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
