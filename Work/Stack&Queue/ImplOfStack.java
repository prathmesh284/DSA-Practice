class MyStack {
    private final int[] stack;
    private int top;
    private final int capacity;
    public MyStack(int size){
        capacity = size;
        stack = new int[capacity];
        top = -1; 
    }
 
    public void push(int x){
        top++;
        stack[top] = x;
    }
    public int pop(){
        int x = stack[top];
        top--;
        return x;
    }
    public int peek(){
        return stack[top];
    }
    public int size(){
        return top + 1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void printStack(){
        for(int i=0; i<=top; i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MyStack st = new MyStack(8);
        st.push(8);
        st.printStack();
        System.out.println(st.peek());
        st.printStack();
        st.push(7);
        st.printStack();
        System.out.println(st.pop());
        st.printStack();
        System.out.println(st.peek());
        st.printStack();
        st.push(1);
        st.printStack();
        System.out.println(st.peek());
        st.printStack();
        System.out.println(st.pop());
        st.printStack();
        System.out.println(st.peek());
        st.printStack();
        System.out.println(st.size());
        st.printStack();
        System.out.println(st.isEmpty());
    }
}