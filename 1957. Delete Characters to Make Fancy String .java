class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int count=1;
        char temp=s.charAt(0);
        sb.append(temp);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==temp && count<2){
             count++;
             sb.append(temp);
            }else if(s.charAt(i)!=temp){
                temp=s.charAt(i);
                count=1;
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}
