class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min=new PriorityQueue<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            min.add(nums[i]);
            if(i>=k){
                min.remove();
            }
        }
        return min.peek();
    }
}
