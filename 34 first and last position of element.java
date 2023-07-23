class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a=new int[2];
        int flag=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && flag==0){
                a[0]=i;
                flag=1;
                count=1;
            }
            else if(nums[i]==target && flag==1){
            a[1]=i;
            count=2;
            }
        }
        if(count==1)
        a[1]=a[0];
        if(flag==0){
            a[0]=-1;
            a[1]=-1;
        }
        return a;
    }
}
