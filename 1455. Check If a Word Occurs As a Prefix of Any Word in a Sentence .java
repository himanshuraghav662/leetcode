class Solution {
    public int isPrefixOfWord(String s, String searchWord) {
        int k=1;
        StringBuilder a = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if (a.toString().startsWith(searchWord)) {
                return k;
            }
             a.setLength(0);
             k++;
            }
            else{
            a.append(s.charAt(i));
            }
        }
          if (a.toString().startsWith(searchWord)) {
                return k;
            }
     return -1;
    }
}
