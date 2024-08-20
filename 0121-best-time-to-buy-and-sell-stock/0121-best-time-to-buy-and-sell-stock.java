class Solution {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int TrialProf=0, ActualProf=0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<lowest){
                lowest = prices[i];
            }
            TrialProf = prices[i]-lowest;
            if(TrialProf>ActualProf){
                ActualProf = TrialProf;
            }
        }
        return ActualProf;
    }
}