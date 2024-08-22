class Solution {
    public int findComplement(int num) {
        int mask = 0;
        int compliment = ~num;
        while(num!=0){
            mask = (mask<<1) | 1;
            num = num>>1;
        }
        return mask & compliment;
        // return ~num & ((Integer.highestOneBit(num) - 1));
    }
}