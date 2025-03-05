class Solution {
    public String longestPalindrome(String s)
    {
        String result = String.valueOf(s.charAt(0));
        int len = 1, maxLen = 1;
        
        for (int i = 0; i < s.length(); i++) {
            int right = s.length();
            int idx;

            while ((idx = s.lastIndexOf(s.charAt(i), right)) != i) {
                String str = s.substring(i, idx + 1);

                if (StringUtil.isPalindrome(str) && str.length() > maxLen) {
                    result = str;
                    maxLen = str.length();
                }

                right = s.lastIndexOf(s.charAt(i), right - 1);
            }
        }

        return result;
    }
}

class StringUtil {
    public static boolean isPalindrome(String s)
    {
        return s.equals(reverse(s));
    }

    public static String reverse(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }
}