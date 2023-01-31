package dsdefaultprograms;

public class StackDS {

    static final int SIZE = 3;
    int arr[] = new int[SIZE];
    int top = -1;

    void push(int val) {
        if (top == SIZE - 1) {
            System.out.println("Stack is Full");
        } else {
            top++;
            arr[top] = val;
        }
    }

    void pop() {
        if (top ==  - 1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Popped Element"+arr[top]);
            top --;
        }
    }

    public static void main(String[] args) {
        StackDS s = new StackDS();
        s.push(10);
        s.push(20);
        s.push(30);

        s.pop();


        

    }

}
