class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans=0;
        int maxi=values[0];
        for(int i=1;i<values.length;i++){
            ans=Math.max(ans,maxi+(values[i]-i));
            maxi=Math.max(maxi,(values[i]+i));
        }
        return ans;
    }
}
