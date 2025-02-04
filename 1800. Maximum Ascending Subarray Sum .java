class Solution {
    public int maxAscendingSum(int[] arr) {
        int ans=0;
        int local=arr[0];
        for(int i=1;i<arr.length;i++){
         if(arr[i]>arr[i-1]){
            local+=arr[i];
         }else{
            ans=Math.max(ans,local);
            local=arr[i];
         }
        }
     return Math.max(ans,local);
    }
}
