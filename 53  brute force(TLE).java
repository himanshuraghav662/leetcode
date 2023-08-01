class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
      int max=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
          int c=0;
          for(int j=i;j<n;j++){
              c+=nums[j];
              max=Math.max(max,c);
          }
      }
return max;
    }
}
