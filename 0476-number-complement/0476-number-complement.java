class Solution {
    public int findComplement(int num) {
        int mask = 0;
        int compliment = ~num;
        while(num!=0){
            mask = (mask<<1) | 1;
            num = num>>1;
        }
        return mask & compliment;
        
        //One line solution
        // return ~num & ((Integer.highestOneBit(num) - 1));
    }
}

//https://medium.com/@Harshit_Raj_14/476-number-complement-easy-leetcode-problem-full-solution-and-approach-explained-e321ac3773c0