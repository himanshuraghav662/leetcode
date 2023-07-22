class Solution {
    public int maximumProduct(int[] nums) {
        int max1=0;
        int max2=0;
        int k=nums.length;
        Arrays.sort(nums);
        max1=nums[k-1]*nums[k-2]*nums[k-3];
        max2=nums[0]*nums[1]*nums[k-1];
        if(max1>max2){
            return max1;
        }
        return max2;
    }
}
