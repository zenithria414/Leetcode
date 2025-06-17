//insert into a stack
class Insert{
    int val;
    int idx;
    public Insert(int valPrice, int index){
        this.val = valPrice;
        this.idx = index;
    }
}

class StockSpanner {
        Stack<Insert> s = new Stack<>(); //initialized stack with insert data type, idx -1 and no val
        int index = -1;
    public StockSpanner() {
        index = -1;
        s.clear();
        //re-initialize everythng for new object
    }
    
    public int next(int price) {
        int ans = 0;
        index += 1;
        while(!s.isEmpty() && price >= s.peek().val){
            s.pop();
        }
        if(s.isEmpty()){
            ans = index+1;
        }
        else{
            int prevHigh = s.peek().idx;
            ans = index-prevHigh;
        }
        //s.push(index);

        Insert pair = new Insert(price, index);
        s.push(pair);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */