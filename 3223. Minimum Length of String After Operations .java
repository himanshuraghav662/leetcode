class Solution {
    public int minimumLength(String s) {
        int[] count=new int[26];
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }
        int ans=0;
        for(int ab : count){
            if(ab==0) continue;
           if(ab % 2==0){
           ans+=2;
           }else{
            ans+=1;
           }
        }
        return ans;
    }
}
