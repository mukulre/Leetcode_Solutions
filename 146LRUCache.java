class LRUCache {
    class Node {
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
    private int capacity;
    private HashMap<Integer, Node> map;
    private Node head;  // Most recently used
    private Node tail;  // Least recently used
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);  // Dummy head
        tail = new Node(0, 0);  // Dummy tail
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        // Move to front (most recently used)
        moveToFront(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        Node node = map.get(key);
        if (node != null) {
            // Update existing node
            node.value = value;
            moveToFront(node);
        } else {
            // Add new node
            node = new Node(key, value);
            map.put(key, node);
            addToFront(node);
            if (map.size() > capacity) {
                // Remove least recently used
                Node lru = tail.prev;
                removeNode(lru);
                map.remove(lru.key);
            }
        }
    }
    
    private void addToFront(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    
    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    private void moveToFront(Node node) {
        removeNode(node);
        addToFront(node);
    }
}