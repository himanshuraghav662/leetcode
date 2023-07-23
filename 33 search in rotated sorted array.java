class Solution {
    public int search(int[] nums, int target) {
        int a=nums.length;
        if(a==1 && nums[0]!=target)
        return -1;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==target)
            return i;
        }

      return -1;
    }
}
