class Solution {
    public int candy(int[] ratings) {
        int cnt=0;
        int n = ratings.length;
        int sum=0;
        int[] temp = new int[n];
        Arrays.fill(temp,1);
        
        for(int i=1; i<n; i++){
            if(ratings[i]>ratings[i-1]){
                temp[i] = temp[i-1]+1;
            }
        }

        for(int i = n - 2; i >= 0; i--){
            if(ratings[i]>ratings[i+1]){
                temp[i] = Math.max(temp[i], temp[i+1]+1);
            }
        }

        for(int i=0; i<n; i++){
            sum += temp[i];
        }

        return sum;

         
    }
}