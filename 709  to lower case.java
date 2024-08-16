class Solution {
    public String toLowerCase(String s) {
        StringBuilder a=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
         if(ch <= 90 && ch>=65){
            ch=(char)(ch+32);
         }
         else{
            ch=s.charAt(i);
         }
         a.append(ch);
        }
        s=a.toString();
        return s;
    }
}
