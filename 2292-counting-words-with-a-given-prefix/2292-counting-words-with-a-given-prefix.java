class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt = 0;
        for(int i=0; i<words.length; i++){
            if(words[i].startsWith(pref)) cnt++;
        }
        return cnt;
    }
}