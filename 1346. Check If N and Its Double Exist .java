class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int temp=2*arr[i];
            if(set.contains(temp))
            return true;

            if(arr[i]%2==0){
                if(set.contains(arr[i]/2))
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
