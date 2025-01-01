class Solution {
    public int maxScore(String s) {
        int one=0;
        for(int i=0;i<s.length();i++){
         if(s.charAt(i)=='1'){
         one++;
         }
        }
        if(one==0 || one==s.length()){
            return s.length()-1;
        }
        int ans=0;
        int zero=0;
        for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)=='0'){
            zero=zero+1;
        }else{
            one--;
        }
        int temp=zero+one;
        ans=Math.max(ans,temp);
        }
        return ans;
    }
}
