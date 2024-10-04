class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i=1;
        int j=skill.length-2;
        long ans=skill[0]*skill[skill.length-1];
        while(i<j){
        if(skill[i]+skill[j]!=skill[i-1]+skill[j+1]){
            return -1;
        }
        else{
            ans+=skill[i]*skill[j];
            i++;
            j--;
        }
        }
        return ans;
    }
}
