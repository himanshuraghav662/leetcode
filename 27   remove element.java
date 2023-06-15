class Solution {
    public int removeElement(int[] nums, int val) {
        int[] n = new int[100];
        int o=0;
         for(int i=0;i<nums.length;i++){
             n[i]=nums[i];
         }
         int k=0;
        for(int i=0;i<nums.length;i++)
        {
         if(n[i]!=val){
             nums[k]=n[i];
             k++;
         }
         else{
             continue;
         }
       o=k;
          }
          while(o<nums.length){
              nums[o]= -1;
              o++;
          }
          return k;
        }
    }
