package interviews;

import java.util.LinkedList;

public class CombinedStringExample {

    // Class for demonstrating String Hash Table
    private static class HashTable {
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
        public HashTable(int size) {
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
    }

    public static void main(String[] args) {
        // 1. String Literal vs. new String()
        System.out.println("1. String Literal vs. new String():");
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println("str1 == str2: " + (str1 == str2)); // true
        System.out.println("str1 == str3: " + (str1 == str3)); // false
        System.out.println();

        // 2. String Interning
        System.out.println("2. String Interning:");
        String str4 = new String("Hello");
        String str5 = str4.intern();

        System.out.println("str4 == \"Hello\": " + (str4 == "Hello")); // false
        System.out.println("str5 == \"Hello\": " + (str5 == "Hello")); // true
        System.out.println();

        // 3. String Immutability
        System.out.println("3. String Immutability:");
        String str6 = "Hello";
        str6.concat(" World");
        System.out.println("str6: " + str6); // "Hello"
        System.out.println();

        // 4. StringBuilder and StringBuffer
        System.out.println("4. StringBuilder and StringBuffer:");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString()); // "Hello World"

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(sbf.toString()); // "Hello World"
        System.out.println();

        // 5. String Comparison
        System.out.println("5. String Comparison:");
        String str7 = "Hello";
        String str8 = new String("Hello");

        System.out.println("str7 == str8: " + (str7 == str8)); // false
        System.out.println("str7.equals(str8): " + str7.equals(str8)); // true
        System.out.println();

        // 6. String Pool Behavior
        System.out.println("6. String Pool Behavior:");
        String str9 = "Hello";
        String str10 = "Hello";
        String str11 = new String("Hello").intern();

        System.out.println("str9 == str10: " + (str9 == str10)); // true
        System.out.println("str9 == str11: " + (str9 == str11)); // true
        System.out.println();

        // 7. Performance Considerations
        System.out.println("7. Performance Considerations:");
        // Inefficient concatenation in a loop
        String str12 = "";
        for (int i = 0; i < 1000; i++) {
            str12 += "a";
        }
        System.out.println("Length of str12: " + str12.length());

        // Efficient concatenation using StringBuilder
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb2.append("a");
        }
        System.out.println("Length of sb2: " + sb2.length());
        System.out.println();

        // 8. HashTable example for additional context
        System.out.println("8. HashTable example:");
        HashTable hashTable = new HashTable(10);
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

