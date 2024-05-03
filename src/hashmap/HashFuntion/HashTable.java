package hashmap.HashFuntion;

class HashNode {
    String key;
    int value;
    HashNode next;

    public HashNode(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class HashTable {
    private final int TABLE_SIZE = 128;
    private HashNode[] table;

    public HashTable() {
        table = new HashNode[TABLE_SIZE];
    }

    private int hashFunction(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + (int) key.charAt(i)) % TABLE_SIZE;
        }
        return hash;
    }

    public void insert(String key, int value) {
        int hash = hashFunction(key);
        if (table[hash] == null) {
            table[hash] = new HashNode(key, value);
        } else {
            HashNode entry = table[hash];
            while (entry.next != null) {
                entry = entry.next;
            }
            entry.next = new HashNode(key, value);
        }
    }

    public int search(String key) {
        int hash = hashFunction(key);
        if (table[hash] != null) {
            HashNode entry = table[hash];
            while (entry != null) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
                entry = entry.next;
            }
        }
        return -1;
    }
}

class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.insert("hello", 1);
        ht.insert("world", 2);
        System.out.println(ht.search("hello"));
        System.out.println(ht.search("world"));
    }
}
