class MyStack {
        Queue<Integer> q1;
        Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        if(!q1.isEmpty()) q1.add(x);
        else q2.add(x);
    }
    
    public int pop() {
        int top = 0;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.remove();
                if(q1.isEmpty()) break;
                q2.add(top);
            }
        }else {
            if(!q2.isEmpty()){
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()) break;
                    q1.add(top);
                }
            }
        }
        return top;
    }
    
    public int top() {
        int top = 0;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.remove();
                q2.add(top);
            }
        }else {
            if(!q2.isEmpty()){
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
            }
        }
        return top;
    }
    
    public boolean empty() {
        return (q1.isEmpty() && q2.isEmpty());
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */