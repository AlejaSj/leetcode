class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String out = "";
        int min = Math.min(strs[0].length(),strs[strs.length-1].length());
        for (int i = 0; i < min; i++) {
            if (strs[0].charAt(i)==strs[strs.length-1].charAt(i)) {
                out+=strs[0].charAt(i);
            }else{
                return out;
            }
        }    
        return out;
    }
}