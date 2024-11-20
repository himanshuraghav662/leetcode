class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ans=new int[code.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=0;
        }
        if(k==0)
        return ans;
        if(k>0){
           int i=1;
           int j=1;
           int add=0;
           while(j<=k){
            add+=code[j];
            j++;
           }
           ans[0]=add;
           while(i<code.length){
            if(j>=code.length)
            j=j%code.length;

            add=add+code[j]-code[i];
            ans[i]=add;
            i++;
            j++;
           }
        }
        if(k<0){
            int n=code.length;
           int i=n-2;
           int j=n-2;
           int add=0;
           k=-1*k;
           while(j>=n-k-1){
            add+=code[j];
            j--;
           }
           ans[n-1]=add;
           while(i>=0){
            if(j<0)
            j=n-1;

            add=add+code[j]-code[i];
            ans[i]=add;
            i--;
            j--;
           }
        }
        return ans;
    }
}
