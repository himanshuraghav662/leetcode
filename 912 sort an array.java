class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> min=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            min.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=min.peek();
            min.remove();
        }
        return nums;
    }
}
