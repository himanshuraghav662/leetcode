class Solution {
    public int jump(int[] nums) {
    int r=0;
        int l=0;
    int c=0;
        for(int i=0;i<nums.length-1;i++){
        if(r<(i+nums[i])){
            r=i+nums[i];
        }
            if(i==l){
                l=r;
                c++;
            }
     
        }
        return c;
    }
    }
