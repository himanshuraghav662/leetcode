class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            c++;
        }
        int q=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[q]=nums[i];
                q++;
            }
        }
        while(c>0){
            nums[q]=0;
            q++;
            c--;
        }
    }
}
