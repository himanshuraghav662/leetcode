class Solution {
    public long pickGifts(int[] arr, int k) {
       PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
       for(int i=0;i<arr.length;i++){
        heap.add(arr[i]);
       }
       while(k>0){
        int temp=heap.peek();
        heap.remove();
        int n=(int)Math.sqrt(temp);
        heap.add(n);
        k--;
       }
       long ans=0;
       while(!heap.isEmpty()){
        ans+=(long)heap.peek();
        heap.remove();
       }

       return ans;
    }
}
