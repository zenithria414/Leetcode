class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, change;
        for(int el : bills){
            if(el==5)
                five++;
            if(el==10)
                ten++;
            change = el - 5;
            if(change == 5){
                if(five>0)
                    five--;
                else
                    return false;
            }
            else if(change == 15){
                if(five>0 && ten>0){
                    five--;
                    ten--;
                }
                else if(five>=3){
                    five-=3;
                }
                else
                    return false;
            }
        }
      return true;  
    }
}