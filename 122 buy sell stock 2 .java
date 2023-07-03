  int profit=0;
        int max=prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--){
            if(prices[i]<max){
                profit+=max-prices[i];
                max=prices[i];
            }
            else
                max=prices[i];
        }
        return profit;
