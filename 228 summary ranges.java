class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> st=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            int start=nums[i];
            while(i<nums.length-1 && nums[i]+1==nums[i+1]){
                i++;
            }
            if(start!=nums[i]){
                st.add(""+start+"->"+nums[i]);
            }
            else{
                st.add(""+start);
            }
        }
        return st;
    }
}
