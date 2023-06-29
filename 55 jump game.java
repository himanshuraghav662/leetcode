class Solution {
    public boolean canJump(int[] nums) {
       
        if(nums.length==1){
        if(nums[0]==0 || nums[0]==1){
            return true;
        }
        }
        else{
            int d=1;
            for(int i=nums.length-2;i>=0;i--){
                if(nums[i]>=d){
                    d=1;
                }
                else{
                    d++;
                    if(i==0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
