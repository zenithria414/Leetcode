class Solution {
    public int heightChecker(int[] heights) {
        int[] org = new int[heights.length];
        int cnt = 0;
        for(int i=0; i<heights.length; i++){
            org[i] = heights[i];
        }
        Arrays.sort(heights);
        for(int i=0; i<heights.length; i++){
            if(heights[i] != org[i]) cnt++;
        }
        return cnt;
    }
}