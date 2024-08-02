class Solution {
    public void sortColors(int[] nums) {
        int ctzero=0, ctone=0, cttwo=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0)
                ctzero++;
            if(nums[i]==1)
                ctone++;
            if(nums[i]==2)
                cttwo++;
        }
        int i=0;
        while(i<ctzero){
            nums[i]=0;
            i++;
        }
        while(i<(ctzero+ctone)){
            nums[i]=1;
            i++;
        }
        while(i<nums.length){
            nums[i]=2;
            i++;
        }
    }
}