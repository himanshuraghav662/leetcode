class Solution {
    public boolean isCircularSentence(String sentence) {
        char[] arr=sentence.toCharArray();
        char start=arr[0];
        char last=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                ++i;
                if(last!=arr[i])
                return false;
            }
          last=arr[i];
        }
        if(start!=last)
        return false;

        return true;
    }
}
