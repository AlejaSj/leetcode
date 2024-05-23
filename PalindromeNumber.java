class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String xs = String.valueOf(x);
        for (int i = 0; i < xs.length()/2; i++) {;
            if (xs.charAt(i)!=xs.charAt(xs.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}