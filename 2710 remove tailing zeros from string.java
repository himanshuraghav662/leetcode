class Solution {
    public String removeTrailingZeros(String num) {
        int a=num.length()-1;
        for(int i=a;i>=0;i--){
           if(num.charAt(i)!='0'){
            break;
        }
            a--;
        }
     return num.substring(0,a+1);
    }
}
