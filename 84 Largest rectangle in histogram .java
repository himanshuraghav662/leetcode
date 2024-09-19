class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
       Stack<Integer> s= new Stack<Integer>();
       int[] left= new int[n];
       int[] right= new int[n];
       for(int i=0;i<n;i++){
        if(s.empty()==true)
        left[i]=-1;
        else if(s.empty()!=true && heights[s.peek()]>=heights[i]){
            while(s.empty()!=true && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.empty()==true)
            left[i]=-1;
            else
            left[i]=s.peek();
        }
        else{
            left[i]=s.peek();
        }
        s.push(i);
       }

       while(s.empty()!=true){
       s.pop(); 
       }

       for(int i=n-1;i>=0;i--){
        if(s.empty()==true)
        right[i]=n;
        else if( s.empty()!=true && heights[s.peek()]>=heights[i]){
            while( s.empty()!=true && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.empty()==true)
            right[i]=n;
            else
            right[i]=s.peek();
        }
        else{
            right[i]=s.peek();
        }
        s.push(i);
       }
       int[] width= new int[n];
       int ans=0;
       for(int i=0;i<n;i++){
        width[i]=(right[i]-left[i])-1;
        if((width[i]*heights[i])>ans)
        ans=width[i]*heights[i];
       }
       return ans;
    }
}
