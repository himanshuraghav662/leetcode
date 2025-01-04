class Solution {
    public int countPalindromicSubsequence(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
       int count=0;
       for(int i=0;i<s.length();i++){
          map.put(s.charAt(i),i);
       }
       for (char c = 'a'; c <= 'z'; c++) {
       if(map.containsKey(c)==false){
        continue;
       }
       int i=0;
       while(s.charAt(i)!=c){
        i++;
       }
       if(i==map.get(c)){
        continue;
       }else{
        HashSet<Character> set=new HashSet<>();
        while(i<map.get(c)-1){
         char w=s.charAt(i+1);
         if(set.contains(w)==false){
            count++;
            set.add(w);
         }
         i++;
        }
       }
       }
       return count;
        
    }
}
