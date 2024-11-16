class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        if(k==1){
        return nums;
        }
        
        for(int i=0;i<=n-k;i++){
            for(int j=i+1;j<i+k;j++){
             if(nums[j]<=nums[j-1] || (nums[j-1]+1)!=nums[j]){
                ans[i]=-1;
                break;
             }else{
                ans[i]=nums[j];
             }
            }
        }
        return ans;
    }
}
