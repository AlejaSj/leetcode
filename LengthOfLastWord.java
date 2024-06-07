class Solution {
    public int lengthOfLastWord(String s) {
         String[] partes = s.split( );
         return partes[partes.length-1].length();
    }
}