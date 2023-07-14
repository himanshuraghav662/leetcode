class Solution {
    public int maxArea(int[] height) {
        int a=0;
        int b=height.length-1;
        int w=0;
        while(a!=b){
         if(height[a]<=height[b]){
             if(w<height[a]*(b-a)){
                 w=height[a]*(b-a);
             }
          a++;
         }
         else{
                 if(w<height[b]*(b-a)){
                 w=height[b]*(b-a);
             }
             b--;
         }
        }
        return w;
    }
}
