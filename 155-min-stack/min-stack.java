class MinStack {
    Stack<Pair> st;

    public MinStack() {
        st = new Stack();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new Pair(val, val));
        }
        else{
            st.push(new Pair(val, Math.min(st.peek().second, val)));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().first;
    }
    
    public int getMin() {
        return st.peek().second;
    }
}

class Pair{
    int first, second;

    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */