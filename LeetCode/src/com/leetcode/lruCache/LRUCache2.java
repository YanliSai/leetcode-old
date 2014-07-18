package com.leetcode.lruCache;

import java.util.LinkedHashMap;

// AC - O(1) for get() and set()
public class LRUCache2 {
    int size;
    LinkedHashMap<Integer, Integer> map;
    
    public LRUCache2(int capacity) {
        size = capacity;
        map = new LinkedHashMap<Integer, Integer>();
    }
    
    public int get(int key) { // Remove and put it to the end of the queue
        if (!map.containsKey(key)) {
            return -1;
        }
        int value = map.get(key);
        map.remove(key); // O(1)
        map.put(key, value); // O(1)
        return value;
    }
    
    public void set(int key, int value) {
        if (map.containsKey(key)) { // If contains the key, need remove first
            map.remove(key);
        } else if (map.size() == size) { // Does not contain the key and cache is full
            for (int firstKey : map.keySet()) { // keySet(): O(1) coz it updates according to map
                map.remove(firstKey);
                break;
            } // The for loop is O(1)
        }
        map.put(key, value);
    }
}
