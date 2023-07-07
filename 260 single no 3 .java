class Solution {
    public int[] singleNumber(int[] nums) {
        
         int[] a=new int[2];
        a[0]=0;
        a[1]=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                if(a[0]==0)
                    a[0]=nums[i];
                else{
                    a[1]=nums[i];
                    return a;
                }
            
            }
            else
                i--;
          
        }
          if(a[1] ==0){
                a[1] =nums[0];
            }
     

        return a;
    }
}
