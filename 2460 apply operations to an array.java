class Solution {
    public int[] applyOperations(int[] nums) {
        int q=0;
        for(int i=0;i<nums.length-1;i++){
          if(nums[i]==nums[i+1]){
              nums[i]=nums[i]*2;
              nums[i+1]=0;
              i++;
          }
        }
          for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[q]=nums[i];
                q++;
            }
        }
        while(q<nums.length){
            nums[q]=0;
            q++;
        }
        return nums;
    }
}
