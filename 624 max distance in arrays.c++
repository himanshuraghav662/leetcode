class Solution {
public:
    int maxDistance(vector<vector<int>>& arrays) {
        int n=arrays.size();
        int mini=arrays[0].front();
        int maxi=arrays[0].back();
        int ans=0;
        for(int i=1;i<n;i++){
            ans=max({ans,abs(maxi-arrays[i].front()),abs(arrays[i].back()-mini)});
            maxi=max(maxi,arrays[i].back());
            mini=min(mini,arrays[i].front());
        }
        return ans;
    }
};
