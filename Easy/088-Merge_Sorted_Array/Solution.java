// Solution inspired by [Aman/https://leetcode.com/problems/merge-sorted-array/solutions/3436053/beats-100-best-c-java-python-and-javascript-solution-two-pointer-stl/]
// and [niits/https://leetcode.com/problems/merge-sorted-array/solutions/5714203/video-simple-solution-coding-exercise/]

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1 = m - 1;
        int idx2 = n - 1;
        int assignIndex = m + n - 1;

        while (idx2 >= 0) {
            if (idx1 >= 0 && nums1[idx1] > nums2[idx2]) {
                nums1[assignIndex] = nums1[idx1];
                --idx1;
            }
            else {
                nums1[assignIndex] = nums2[idx2];
                --idx2;
            }
            --assignIndex;
        }
    }
}