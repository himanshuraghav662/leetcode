class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> heap= new PriorityQueue<>(Collections.reverseOrder());
        long ans=0;
        for(int i=0;i<nums.length;i++){
            heap.add(nums[i]);
        }
        while(k>0){
            int temp=heap.poll();
            ans+=temp;
            temp=(temp+2)/3;
            heap.add(temp);
            k--;
        }
        return ans;
    }
}
