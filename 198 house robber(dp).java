class Solution {
    int sol(int[] nums,int[] dp,int n){

        if(n<0)
            return 0;
        if(n==0)
            return nums[0];
        if(dp[n]!=-1)
            return dp[n];
        else{

        int inc=sol(nums,dp,n-2)+nums[n];
        int exc=sol(nums,dp,n-1)+0;
        return dp[n]= Math.max(inc,exc);
    }
        }
   
    public int rob(int[] nums,int [] dp) {
       int [] dp =new int[nums.length];
    Arrays.fill(dp,-1);
      int n=nums.length-1;
        int ans=sol(nums,dp,n);
        return ans;
        
        
        
        
    }
}
