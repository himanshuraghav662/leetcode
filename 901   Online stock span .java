class StockSpanner {
Stack<int[]> s;
    public StockSpanner() {
   s =new Stack<>();

    }
    
    public int next(int price) {
         int ans=1;
        while(s.size() > 0 && price >= s.peek()[0]){
            ans += s.pop()[1];
        } 
        s.push(new int[]{price,ans});

        return ans;
    }
}
