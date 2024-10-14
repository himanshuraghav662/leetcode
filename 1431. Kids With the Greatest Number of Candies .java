class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i=0;i<candies.length;i++){
         if(candies[i]>max)
         max=candies[i];
        }
        List<Boolean> list=new ArrayList<>(candies.length);
        for(int i=0;i<candies.length;i++){
           if(candies[i]+extraCandies<max)
           list.add(false);
           else
           list.add(true); 
        }
        return list;
    }
}
