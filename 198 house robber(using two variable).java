class Solution {
    
    int sol1(int[] nums){
        int n =nums.length;
        int p2=0;
        int p1=nums[0];
      
        for(int i=1;i<n;i++){
        int inc=p2+nums[i];
            int exc =p1+0;
            p2=p1;
            p1=Math.max(inc,exc);
        }
        return(p1);
        
    }
    public int rob(int[] nums) {
     
        int ans=sol1(nums);
        return ans;   
    }
}
