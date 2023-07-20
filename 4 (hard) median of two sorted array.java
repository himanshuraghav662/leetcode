class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
         int[] a=new int[n];
        int i=nums1.length;
        for(int j=0;j<i;j++){
            a[j]=nums1[j];
        }
        int j=0;
        while(j<nums2.length){
        a[i]=nums2[j];
        j++;
        i++;
        }
        Arrays.sort(a);
        double b=0;
        if(n==1){
            b=(float)a[0];
            return b;
        }
        if(n%2==0){
            b=(float)(a[n/2-1]+a[(n/2)]);
            b=b/2;
        }
        else
        b=a[(n/2)];
        return b;
    }
}
