class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] s=new int[2];
        
          for(int k=0;k<numbers.length;k++){
          for(int l=0;l<numbers.length;l++){
              if(k!=l){
         if(numbers[k]+numbers[l]==target){
             s[0]=k+1;
             s[1]=l+1;
             return s;
         }
              }
        }
        while(k+1<=numbers.length-1 && numbers[k+1]==numbers[k]){
            k++;
        }
        }
        
        return s;
    }
}
