class MyCircularQueue {
    private int[] queue;
    private int front;  // Index of the front element
    private int rear;   // Index where the next element will be inserted
    private int size;   // Current number of elements
    private int capacity;  // Maximum capacity of the queue

    public MyCircularQueue(int k) {
        queue = new int[k];
        front = 0;
        rear = 0;
        size = 0;
        capacity = k;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        queue[rear] = value;
        rear = (rear + 1) % capacity;  // Move rear circularly
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;  // Move front circularly
        size--;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }
    
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        // rear points to the next insertion point, so the last element is at (rear - 1 + capacity) % capacity
        return queue[(rear - 1 + capacity) % capacity];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}