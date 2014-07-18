package com.leetcode.lruCache;

import java.util.LinkedHashMap;
import java.util.Map;

// AC - Time: get() and set(): O(1)
public class LRUCache extends LinkedHashMap<Integer, Integer> {
	private static final long serialVersionUID = 1L; // super class is Serializable
	int size;
    
    public LRUCache(int capacity) {
        super(16, 0.75F, true); // Set access_order to true
        size = capacity;
    }
    
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) { // called by put()
        return size() > size;
    }
    
    public int get(int key) {
        if (!containsKey(key)) {
            return -1;
        }
        return super.get(key); // Call super
    }
    
    public void set(int key, int value) {
        put(key, value);
    }
}
