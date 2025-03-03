class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        if (x < 10)
            return true;

        return x == NumberUtil.reverse(x);
    }
}

class NumberUtil {
    public static int reverse(int x)
    {
        int rev = 0;

        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return rev;
    }
}