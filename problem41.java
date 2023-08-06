                         //using hash table
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> list=new HashSet<Integer>();
        int i=0;
        for(i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
        for(i=0;i<nums.length;i++)
        {
            if(!list.contains(i+1))
            {
                return(i+1);
            }
        }
        return(i+1);
    }
}



                               //using cycle sort

class Solution {
    public int firstMissingPositive(int[] nums) {
         int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[correct]) {

                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else {
                i++;
            }
        }

        int count = 0;

         for(int j = 0; j < nums.length; j++) {

            if(nums[j] != j + 1) {
                return j + 1;
            }
        }
        return nums.length+1;
    }
}
