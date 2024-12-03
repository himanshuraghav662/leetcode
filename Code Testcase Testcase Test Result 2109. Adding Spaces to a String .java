class Solution {
    public String addSpaces(String s, int[] spaces) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<spaces.length;i++){
            set.add(spaces[i]);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
        if(set.contains(i)==true){
            sb.append(' ');
        }

        sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
