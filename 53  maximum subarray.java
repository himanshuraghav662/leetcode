class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
      int max=Integer.MIN_VALUE;
      int c=0;
      for(int i=0;i<n;i++){
              c+=nums[i];
              max=Math.max(max,c);
              if(c<0)
              c=0;
          
      }
return max;
    }
}
