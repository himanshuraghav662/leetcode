class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int money=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                money=money+accounts[i][j];
            }
            max=Math.max(max,money);
            money=0;
        }
        return max;
    }
}
