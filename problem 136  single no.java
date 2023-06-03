class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=0;
        int b=0;
        int i;
        if(nums.length%2==0){
      for(i=1;i<nums.length;i++)
      {
        
      if(nums[i-1]!=nums[i])
      {
        n = n + nums[i-1];
        break;
      }
      else{
          i++;
      }

        }
        }
        else{
        for(i=1;i<(nums.length)-1;)
        {
           if(nums[i-1]!=nums[i])
      {
        n = n + nums[i-1];
        break;
      }
      else{
          i=i+2;
          
      }
        b = i-1;
        }
    
  n=nums[b];
        }
      
      
        return n;
    }
}
