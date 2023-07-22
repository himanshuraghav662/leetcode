class Solution {
    public int[] sortArray(int[] nums) {

       int min=10000;
        int k=0;
        for(int j=0;j<nums.length-1;j++){
        for(int i=j;i<nums.length-1;i++){
            if(nums[i]<min){
                min=nums[i];
                k=i;
            }
           
        }
            int temp=nums[j];
            nums[j]=nums[k];
            nums[k]=temp;
    }
        return nums;
        }
}
