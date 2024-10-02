class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        int i = 0;
        int j = 2;
        while (j < s.length()) {
            if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i + 1) != s.charAt(j) && s.charAt(i) != s.charAt(j))
                count++;

            i++;
            j++;
        }
        return count;
    }
}
