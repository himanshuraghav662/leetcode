class Solution {
    public String compressedString(String word) {
        int count=1;
        StringBuilder s=new StringBuilder();
     char[] arr=word.toCharArray();
     char temp=arr[0];
     for(int i=1;i<arr.length;i++){
       if(arr[i]==temp){
        count++;
        if(count>9){
            s.append(9);
            s.append(temp);
            count=1;
        }
       }else{
        s.append(count);
        s.append(temp);
        temp=arr[i];
        count=1;
       }
     }
     s.append(count);
     s.append(temp);
     return s.toString();
    }
}
