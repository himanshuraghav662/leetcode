class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        long temp=0;
        while(j<k){
            temp+=nums[j];
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(map.size()==k)
            ans=temp;

            j++;
        }
        while(j<nums.length){
        temp=temp+nums[j]-nums[i];
         map.put(nums[j],map.getOrDefault(nums[j],0)+1);
         if(map.get(nums[i])>1){
            map.put(nums[i],map.get(nums[i])-1);
         }else{
            map.remove(nums[i]);
         }
        if(temp>ans && map.size()==k){
            ans=temp;
        }
        i++;
        j++;
        }
        return ans;
    }
}
