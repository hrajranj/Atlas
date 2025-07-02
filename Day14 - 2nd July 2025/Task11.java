//Wap to create  a queue with custom methods
	//Is empty ()
	//Is full()
	//Enque
    //Deque
    //Peek
    //display()



    class Node {
        int data;
        Node next;
    
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    
    class CustomQueue {
        private Node front = null;
        private Node rear = null;
        private int size = 0;
        private int capacity;
    
    
        public CustomQueue(int capacity) {
            this.capacity = capacity;
        }
    
    
        public boolean isEmpty() {
            return front == null;
        }
    
    
        public boolean isFull() {
            return size == capacity;
        }
    
    
        public void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full. Cannot enqueue " + data);
                return;
            }
    
    
            Node newNode = new Node(data);
            if (isEmpty()) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
            System.out.println("Enqueued: " + data);
        }
    
    
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return;
            }
    
    
            System.out.println("Dequeued: " + front.data);
            front = front.next;
            size--;
    
    
            if (front == null) {
                rear = null;
            }
        }
    
    
        public void peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
            } else {
                System.out.println("Front element: " + front.data);
            }
        }
    
    
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }
    
    
            Node current = front;
            System.out.print("Queue elements: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    
    
    public class Task11 {
        public static void main(String[] args) {
            CustomQueue q = new CustomQueue(5); // Max 5 elements
    
    
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);
    
    
            q.display();
    
    
            q.dequeue();
            q.dequeue();
    
    
            q.display();
    
    
            q.peek();
    
    
            q.enqueue(60); // Should succeed
            q.enqueue(70); // Should fail (capacity = 5)
    
    
            q.display();
    
    
            System.out.println("Is Empty? " + q.isEmpty());
            System.out.println("Is Full? " + q.isFull());
        }
    }
    
