class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0;
        double local=0;
        int i=0;
        int j=0;
        while(j<k){
         local+=nums[j];
         j++;
        }
        ans=local/k;
        if(nums.length==k)
        return ans;
        while(j<nums.length){
        local=local-nums[i]+nums[j];
        ans=Math.max(ans,(local/k)); 
        i++;
        j++; 
        }
        return ans;
    }
}
