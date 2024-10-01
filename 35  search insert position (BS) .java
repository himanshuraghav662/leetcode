class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
         int ans=-1;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]<target){
            start=mid+1;
            ans=mid;
            }
            else
            end=mid-1;
        }
        
        return ans+1;
    }
}
