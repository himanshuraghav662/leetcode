class Solution {
    public int reverse(int x) {
        if(x==0)
        return 0;
        long a=0;
        int c=x;
        if(x<0)
        c=(-1)*c;
        while(c>0){
            a=a*10+x%10;
            x=x/10;
            c=c/10;
        }
      if(a<=Integer.MIN_VALUE || a>=Integer.MAX_VALUE)
      return 0;

      return (int)a;
    }
}
