class Solution {
    public String addBinary (String a, String b) {
     StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int bitSum = carry;
            if (i >= 0) {
                bitSum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                bitSum += b.charAt(j) - '0';
                j--;
            }

            result.append(bitSum % 2);
            carry = bitSum / 2;
        }

        return result.reverse().toString();
    }

 
}