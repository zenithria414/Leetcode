class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int cnt = 0;
        for(int i=0; i<words.length; i++){
            for(int j=i+1; j<words.length; j++){  //pair(i,j) -> match front & back of ith with jth
                if(i==j) continue;
                if(i<j){
                    if(words[j].endsWith(words[i]) && words[j].startsWith(words[i])){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}