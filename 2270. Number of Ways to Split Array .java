class Solution {
    public int waysToSplitArray(int[] nums) {
        int count=0;
        long sum=0;
        for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        }
        long start=0;
        for(int i=0;i<nums.length-1;i++){
        start+=nums[i];
        if(start>=sum-start){
            count++;
        }
        }
        return count;
    }
}
