class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int, int> m;
        for(int i=0; i<nums.size(); i++){
            m[nums[i]]++;
        }
        priority_queue<pair<int, int>, vector<pair<int,int>>, greater<pair<int,int>>> minh;

        for(auto item: m){
            minh.push({item.second, item.first});
            if(minh.size() > k) minh.pop();
        }
        vector<int> ans;
        while(!minh.empty()){
            ans.push_back(minh.top().second);
            minh.pop();
        }
        return ans;
    }
};
