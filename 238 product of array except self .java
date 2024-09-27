class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int[] ans=new int[nums.length];
        int mul=1;
        for(int i=0;i<nums.length;i++){
            mul*=nums[i];
            left[i]=mul;
        }
        mul=1;
         for(int i=nums.length-1;i>=0;i--){
            mul*=nums[i];
            right[i]=mul;
        }
        for(int i=0;i<nums.length;i++){
          if(i==0)
          ans[i]=right[i+1];
          else if(i==nums.length-1)
          ans[i]=left[i-1];
          else{
            ans[i]=left[i-1]*right[i+1];
          }
        }
        return ans;
    }
}
