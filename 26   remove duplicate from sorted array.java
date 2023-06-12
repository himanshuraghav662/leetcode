class Solution {
    public int removeDuplicates(int[] nums) {
        int g = 1;
        int a = nums[0];
        for(int i=1;i<nums.length;i++){
         if(a==nums[i]){
          continue;
         }
         else{
             a=nums[i];
             nums[g]=nums[i];
             g++;   
             continue;
         }
        
        }
        
        return g;
    }
    
}
