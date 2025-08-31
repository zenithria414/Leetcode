class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            freq1[ch-'a']++;
        }
        for(int i=0; i<t.length();i++){
            char ch = t.charAt(i);
            freq2[ch-'a']++;
        }
        for(int i=0; i<26; i++){
            if(freq1[i] != freq2[i]) return false;
        }
        return true;
        // HashMap<Character, Integer> map1 = new HashMap<>();
        // HashMap<Character, Integer> map2 = new HashMap<>();

        // for (char c : s.toCharArray()) {
        //     map1.put(c, map1.getOrDefault(c, 0) + 1);
        // }

        // for (char c : t.toCharArray()) {
        //     map2.put(c, map2.getOrDefault(c, 0) + 1);
        // }

        // return map1.equals(map2);
    }
}