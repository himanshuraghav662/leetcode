class Solution {
    public int maxWidthRamp(int[] arr) {
        int j=arr.length;
        int max=0;
        Stack<Integer> s= new Stack<>();
        for(int i=0;i<j;i++){
            if(s.empty()==true || arr[s.peek()]>arr[i])
            s.push(i);
        }
        for(int i=j-1;i>=0;i--){
            while(!s.empty() && arr[i]>=arr[s.peek()]){
                max=Math.max(max,i-s.peek());
                s.pop();
            }
        }
        return max;
    }
}
