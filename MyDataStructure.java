package com.Job;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Task 6
public class MyDataStructure {

    private ArrayList<Integer> arr; // Store integers
    private Map<Integer, Integer> map; // Store indexes

    public MyDataStructure() {
        arr = new ArrayList<>();
        map = new HashMap<>();
    }


    public void add(int x) {

        if (!map.containsKey(x)) {
            int index = arr.size();
            arr.add(x);
            map.put(x, index);
        }
    }

    // Method to remove an element from the data structure
    public void remove(int x) {

        if (map.containsKey(x)) {
            int index = map.get(x);
            map.remove(x);
            int last = arr.size() - 1;
            arr.set(index, arr.get(last));
            arr.remove(last);
            map.put(arr.get(index), index);
        }
    }

    public int get(int x) {

        if (map.containsKey(x)) {
            return map.get(x);
        }
        // -1 to indicate that the value wasn't found
        return -1;
    }
}


