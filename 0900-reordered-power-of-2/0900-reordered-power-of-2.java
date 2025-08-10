class Solution {
    public boolean sameFrequency(int num, HashMap<Integer, Integer> map){
        HashMap<Integer, Integer> twopow = new HashMap<>();
        while(num>0){
            twopow.put(num%10, twopow.getOrDefault(num%10,0)+1);
            num /= 10;
        }
        return twopow.equals(map);
    }
    public boolean reorderedPowerOf2(int n) {
        if(n==1) return true;
        int digitCounter = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(n>0){
            digitCounter++;
            map.put(n%10, map.getOrDefault(n%10, 0)+1);
            n /= 10;
        }

        for(int i=1; String.valueOf(i).length() <= digitCounter; i*= 2){
            if(String.valueOf(i).length() == digitCounter){
                if(sameFrequency(i,map)){
                    return true;
                }
            }
        }
        return false;
    }
}