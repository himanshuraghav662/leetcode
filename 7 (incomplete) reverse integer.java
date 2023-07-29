class Solution {
    public int reverse(int x) {
        if(x==0)
        return 0;
        int a=x;
        int c=0;
        if(x>0){
        while(a>0){
            a=a/10;
            c++;
        }
        while(c>0){
            a+=(x%10)*(10^c);
            x=x/10;
            c--;
        }
        
      }
      else{
           x=-x;
           while(a>0){
            a=a/10;
            c++;
        }
        while(c>0){
            a+=(x%10)*(10^c);
            x=x/10;
            c--;
        }
        a=-a;
      }
      if(a<=Integer.MIN_VALUE || a>=Integer.MAX_VALUE)
      return 0;

      return a;
    }
}
