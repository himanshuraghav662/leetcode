class Solution {
    public int singleNumber(int[] nums) {
       Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        for(int i=nums.length-1;i>=0;){
            if(i==0){
                return nums[i];
            }
            if(nums[i]==nums[i-2]){
                i=i-3;
            }
            else{
                return nums[i];
            }
        }
        System.gc();
        return 1;
    }
}
