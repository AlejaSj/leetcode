class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character,Integer>convertToRoman = new HashMap<>();
        convertToRoman.put('I', 1);
        convertToRoman.put('V', 5);
        convertToRoman.put('X', 10);
        convertToRoman.put('L', 50);
        convertToRoman.put('C', 100);
        convertToRoman.put('D', 500);
        convertToRoman.put('M', 1000);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            Integer s1 = convertToRoman.get(s.charAt(i));
            if (i + 1 < s.length()) 
            {
                int s2 = convertToRoman.get(s.charAt(i+1));
                if (s1 >= s2)
                    res = res + s1;
                else
                {
                    res = res + s2 - s1;
                    i++;
                }
            }
            else
            {
                res = res + s1;
            }
        }
        return res;
    }
}