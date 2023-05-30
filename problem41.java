
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> list=new HashSet<Integer>;
        for(int i=0;i<nums;i++)
        {
            list.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!list.contains(i+1))
            {
                return(i+1);
            }
        }
        return(i+1);
    }
}
