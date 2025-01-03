class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<nums1.length;i++){
        map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
       } 
       List<Integer> list=new ArrayList<>();
       for(int i=0;i<nums2.length;i++){
        if(map.containsKey(nums2[i])){
            list.add(nums2[i]);
            map.put(nums2[i],map.get(nums2[i])-1);
            if(map.get(nums2[i])==0)
            map.remove(nums2[i]);
        }
       }
       int[] arr =new int[list.size()];
       for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
       }

       return arr;
    }
}
