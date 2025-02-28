// Solution inspired by [niits/https://leetcode.com/problems/remove-element/solutions/5468263/video-step-by-step-explanation/]

class Solution {
    public int removeElement(int[] nums, int val)
    {
        int k = 0;
        
        for (int i = 0; i < nums.length; i++)       
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }

        return k;
    }
}