class MyHashMap {
    private static final int SIZE = 769;  // A prime number for better hash distribution
    private LinkedList<Entry>[] buckets;

    class Entry {
        int key;
        int value;
        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    
    private int hash(int key) {
        return key % SIZE;  // Simple modulo hash function
    }
    
    public void put(int key, int value) {
        int index = hash(key);
        LinkedList<Entry> bucket = buckets[index];
        
        // Check if key already exists
        for (Entry entry : bucket) {
            if (entry.key == key) {
                entry.value = value;  // Update value if key exists
                return;
            }
        }
        // Add new key-value pair if key doesn't exist
        bucket.add(new Entry(key, value));
    }
    
    public int get(int key) {
        int index = hash(key);
        LinkedList<Entry> bucket = buckets[index];
        
        // Search for the key in the bucket
        for (Entry entry : bucket) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return -1;  // Key not found
    }
    
    public void remove(int key) {
        int index = hash(key);
        LinkedList<Entry> bucket = buckets[index];
        
        // Search for and remove the key
        for (Entry entry : bucket) {
            if (entry.key == key) {
                bucket.remove(entry);
                return;
            }
        }
    }
}