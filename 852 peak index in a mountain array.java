class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max=0;
        int p=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                p=i;
            }
        }
        return p;
    }
}






class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int mid=arr.length/2;
       for(int i=mid;i<arr.length;i++){
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
       return mid;
       else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
       mid=mid+1;
       else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1])
       mid=mid-1;
       }
        return mid;
    }
}
