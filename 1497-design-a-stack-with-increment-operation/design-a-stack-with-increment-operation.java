//Lazy Increment method:
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


// class CustomStack {
//     Stack<Integer> st;
//     int maxSize;
//     public CustomStack(int maxSize) {
//         st = new Stack<>();
//         this.maxSize = maxSize;
//     }
    
//     public void push(int x) {
//         if(st.size()>=maxSize) return;
//         st.push(x);
//     }
    
//     public int pop() {
//         if(st.isEmpty()) return -1;
//         int top = st.pop();
//         return top;
//     }
    
//     public void increment(int k, int val) {
//         int limit = Math.min(k,st.size());
//         for(int i=0; i<limit; i++){
//             st.set(i, st.get(i)+val);
//         }
//     }
// }

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */