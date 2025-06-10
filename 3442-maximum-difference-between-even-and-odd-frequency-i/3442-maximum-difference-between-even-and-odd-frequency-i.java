class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }

        int maxOdd = 0;
        int minEven = s.length();

        for(int i=0; i<26; i++){
            if(freq[i]==0) continue;
            if(freq[i]%2==0){
                minEven = Math.min(minEven,freq[i]);
            }
            if(freq[i]%2==1){
                maxOdd = Math.max(maxOdd,freq[i]);
            }
            
        }

        if(minEven == s.length()) minEven = 0;

        return maxOdd-minEven;
    }
}