class Solution {
    public void rotate(int[] nums, int k) {
        int[] n=new int[100000];
        int q=k;
        int i=0;
        int p=0;
        while(q > nums.length){
            q=q-nums.length;
        }
        if(k!=nums.length){
        for(i=0;i<nums.length-q;i++){
         continue;
        }
        for(int h=i;h<nums.length;h++){
            n[p]=nums[h];
            p++;
        }
         for(i=0;i<nums.length-q;i++){
         n[p]=nums[i];
         p++;
        }
        for(int b=0;b<nums.length;b++){
            nums[b]=n[b];
        }
        
        }
    }
}
