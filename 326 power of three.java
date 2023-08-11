class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0 || n==2)
return false;
while(n%3==0){
    n=n/3;
    if(n%27==0)
    n=n/27;
    if(n%9==0)
    n=n/9;
}
if(n==1)
return true;

return false;
    }
}
