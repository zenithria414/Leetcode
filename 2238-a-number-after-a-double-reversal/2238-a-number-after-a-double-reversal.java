class Solution {
    public boolean isSameAfterReversals(int num) {
        // int orgnum = num;
        // int rev1 = 0;
        // while(num>0){
        //     rev1 = rev1*10 + (num%10);
        //     num = num/10;
        // }
        // int rev2 = 0;
        // while(rev1>0){
        //     rev2 = rev2*10 + (rev1%10);
        //     rev1 = rev1/10;
        // }
        // if(rev2==orgnum) return true;
        // else return false;
        return num==0 || num%10>0;
    }
}