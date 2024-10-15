class Solution {
    public long minimumSteps(String s) {
      long count=0;
      long ans=0;
      int j=s.length()-1;
      while(j>=0){
       if(s.charAt(j)=='0')
       count++;
       else{
        ans+=count;
       }
       j--;
      }
return ans;
    }
}
