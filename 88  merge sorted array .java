class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        if(m==0){
        j=0;
        }
        else{
        for(i=0;i<m;i++){
              
        }
        j=i;
        }
        if(n==0){
            for(int l=j;l<nums1.length;l++){
                nums1[l]=-1;
            }
        }
        else{
            
        for(int k=0;k<n;k++){
            nums1[j]=nums2[k];
            j++;
        }
        for(int u=j;u<nums1.length;u++){
            nums1[u]=-1;
        }
        
      } 
      Arrays.sort(nums1);
    }
}
