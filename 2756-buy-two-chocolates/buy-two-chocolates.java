class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int count=0;
        int rem=money;
        int i=0;
        while(i<=prices.length-1)
        {
             if(rem>=prices[i])
             {
                count++;
               rem= rem-prices[i];
               i++;
               if(count==2) 
               {
                return rem;
               }
             }
             else
             {
                return money;
             }
        }
        return money;
        
    }
}