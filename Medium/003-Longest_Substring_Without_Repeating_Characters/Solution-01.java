class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0, currentLength = 0;
        
        int fromIndex = 0, i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);

            if (s.substring(fromIndex, i).indexOf(c) == -1)
                currentLength++;
            else {
                i = s.indexOf(c, fromIndex);
                fromIndex = i + 1;
                currentLength = 0;
            }

            i++;

            if (currentLength > maxLength)
                maxLength = currentLength;
        }

        return maxLength;
    }
}