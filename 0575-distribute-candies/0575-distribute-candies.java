class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int res = 1;
        int temp = candyType[0];
        for ( int i=0; i<candyType.length; i++){ 
             
            if(temp != candyType[i]){
                temp = candyType[i];
                res++;
            }   
        }
        return Math.min(res, (candyType.length/2));
    }
}