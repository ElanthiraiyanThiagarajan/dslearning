package dsdefaultprograms;

public class QueueDSTemplate {
    static final int SIZE = 3;
    int arr[] = new int[SIZE];
    int front = 0;
    int rear = 0;

    void enqueue(int val){
        if(SIZE==rear){
            System.out.println("Queue is empty");
        }else{
            arr[rear] = val;
            rear++;
        }
    }

    void deQueue(){
        if(rear==front){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Dequeue Data"+arr[front]);
            front++;

        }
    }

    public static void main(String[] args) {
        QueueDSTemplate queue = new QueueDSTemplate();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.deQueue();
    }
}
