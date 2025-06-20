class CustomStack {
    int[] stack;
    int[] inc;
    int maxSize;
    int top;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
        this.inc = new int[maxSize];
        this.top = -1;
    }

    public void push(int x) {
        if (top + 1 >= maxSize) return;
        top++;
        stack[top] = x;
    }

    public int pop() {
        if (top == -1) return -1;
        int res = stack[top] + inc[top];
        if (top > 0) inc[top - 1] += inc[top]; // pass down the increment
        inc[top] = 0;
        top--;
        return res;
    }

    public void increment(int k, int val) {
        int idx = Math.min(k, top + 1) - 1;
        if (idx >= 0) {
            inc[idx] += val;
        }
    }
}


// class MinStack {
//     Stack<Pair> st;

//     public MinStack() {
//         st = new Stack();
//     }
    
//     public void push(int val) {
//         if(st.isEmpty()){
//             st.push(new Pair(val, val));
//         }
//         else{
//             st.push(new Pair(val, Math.min(st.peek().second, val)));
//         }
//     }
    
//     public void pop() {
//         st.pop();
//     }
    
//     public int top() {
//         return st.peek().first;
//     }
    
//     public int getMin() {
//         return st.peek().second;
//     }
// }

// class Pair{
//     int first, second;

//     Pair(int first, int second){
//         this.first = first;
//         this.second = second;
//     }
// }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */