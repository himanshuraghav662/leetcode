class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        if(s.length()==1)
        return 1;
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(st.empty()==true){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)=='B' && st.peek()=='A'){
                st.pop();
            }
            else if(s.charAt(i)=='D' && st.peek()=='C'){
                st.pop();
            }
            else
            st.push(s.charAt(i));
        }

        return st.size();
    }
}
