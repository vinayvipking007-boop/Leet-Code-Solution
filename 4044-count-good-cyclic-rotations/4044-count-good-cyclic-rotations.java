class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int half = n / 2;
        int ans = 0;
        long total = 0;
        long left = 0;
        for (int i = 0; i < n; i++) {
            total = total + nums[i];
        }
        for (int i = 0; i < half; i++) {
            left = left + nums[i];
        }
        for (int i = 0; i < n; i++) {
            long right = total - left;

            if (left > right) {
                ans++;
            }
            left = left - nums[i];
            left = left + nums[(i + half) % n];
        }
        return ans;
    }
}