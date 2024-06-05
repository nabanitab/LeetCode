package hashmap.HashFuntion;

import java.util.LinkedList;

public class BasicHashTable {
    private class Entry {
        String key;
        int value;

        Entry(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public BasicHashTable(int size) {
        this.size = size;
        this.table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int customHash(String key) {
        int hashValue = 0;
        for (char c : key.toCharArray()) {
            hashValue = (hashValue * 31 + (int) c) % size;
        }
        return hashValue;
    }

    public void insert(String key, int value) {
        int hashKey = customHash(key);
        LinkedList<Entry> bucket = table[hashKey];
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;  // Update existing key
                return;
            }
        }
        bucket.add(new Entry(key, value));
    }

    public Integer retrieve(String key) {
        int hashKey = customHash(key);
        LinkedList<Entry> bucket = table[hashKey];
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;  // Key not found
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(i).append(": ");
            for (Entry entry : table[i]) {
                sb.append("[").append(entry.key).append(", ").append(entry.value).append("] ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BasicHashTable hashTable = new BasicHashTable(10);
        hashTable.insert("apple", 10);
        hashTable.insert("banana", 20);
        hashTable.insert("grape", 30);
        hashTable.insert("cherry", 40);

        System.out.println("Hash Table:");
        System.out.println(hashTable);

        System.out.println("Retrieve Values:");
        System.out.println("apple: " + hashTable.retrieve("apple"));
        System.out.println("banana: " + hashTable.retrieve("banana"));
        System.out.println("grape: " + hashTable.retrieve("grape"));
        System.out.println("cherry: " + hashTable.retrieve("cherry"));
        System.out.println("orange (not inserted): " + hashTable.retrieve("orange"));
    }
}
