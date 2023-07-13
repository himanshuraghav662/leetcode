class Solution {
    public int lengthOfLastWord(String s) {
       int d=0;
      int l=s.length()-1;
      if(l==0){
          return 1;
      }
        while(s.charAt(l)==' '){
            l--;
        }
         if(l==0){
          return 1;
      }
        while(s.charAt(l)!=' '){
            d++;
            l--;
            if(l==-1){
                return d;
            }
        }
        return d;
    }
}
