class Solution {
    public String getPattern(String word) {
        int[] arr = new int[26];
        for (int i = 0; i < word.length(); i++) {
            int charIndex = (int)(word.charAt(i) - 'a');
            arr[charIndex]++;
        }
        return Arrays.toString(arr);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        if(strs == null || strs.length==0) return res;

        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            String pattern = getPattern(word);
            if(!map.containsKey(pattern)){
                map.put(pattern, new ArrayList<String>());
            }
            map.get(pattern).add(word);
        }

        for(List<String> list : map.values()){
            res.add(list);
        }
        return res;
    }
}