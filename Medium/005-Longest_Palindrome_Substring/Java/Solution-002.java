// Solution inspired by [Gourav Yadav/https://leetcode.com/problems/longest-palindromic-substring/solutions/4212564/beats-96-49-5-different-approaches-brute-force-eac-dp-ma-recursion/]

class Solution {
    public String longestPalindrome(String s)
    {
        if (s.length() <= 1)
            return s;

        String result = s.substring(0, 1);
        int maxLen = 1;

        for (int i = 0; i < s.length(); i++)
            for (int k = i + maxLen; k <= s.length(); k++) {
                if (k - i > maxLen && StringUtil.isPalindrome(s.substring(i, k))) {
                    maxLen = k - i;
                    result = s.substring(i, k);
                }
            }

        return result;
    }
}

class StringUtil {
    public static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}