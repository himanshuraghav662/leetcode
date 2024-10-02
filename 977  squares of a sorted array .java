class Solution {
    public int[] sortedSquares(int[] nums) {
        if (nums.length == 1)
            return new int[] { nums[0] * nums[0] };
        int[] ans = new int[nums.length];
        int num = nums.length - 1;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int a = nums[i] * nums[i];
            int b = nums[j] * nums[j];
            if (a >= b) {
                ans[num] = a;
                num--;
                i++;
            } else {
                ans[num] = b;
                num--;
                j--;
            }
        }

        return ans;
    }
}
