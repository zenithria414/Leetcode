class Solution {
    public int minimumRounds(int[] tasks) {
        int n = tasks.length;
        //int cnt = 1;
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int t:tasks){
            map.put(t, map.getOrDefault(t,0)+1);
        }

        for(int val: map.values()){
            if(val == 1) return -1;
            if(val%3 == 0) res += val/3;
            else if(val%3 !=0) res += val/3+1;
        }

        return res;

            // Arrays.sort(tasks);

            // for(int i=0; i<n-1; i++){
            //     if(tasks[i]==tasks[i+1]){
            //         cnt++;
            //     }else{
            //         if(cnt == 1) return -1;
            //         if(cnt%3==0 ){
            //             res += cnt/3;
            //         }else{
            //             res += cnt/3+1;
            //         }

            //         cnt = 0;
            //     }
            // }
            // return res;
    }
}