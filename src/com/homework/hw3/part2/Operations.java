package com.homework.hw3.part2;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Operations {
    public static long addTime(Collection<Integer> collection, int n) {
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            collection.add(collection.size() + i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long insertTime(List<Integer> list, int n) {
        long startTime = System.nanoTime();
        list.add(list.get(n));
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long indexOfTime(List<Integer> list, int n) {
        int index = -1;
        long startTime = System.nanoTime();
        index = list.indexOf(n);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long removeTime(List<Integer> list, int index) {
        Integer deleted;
        long startTime = System.nanoTime();
        deleted = list.remove(index);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long searchTime(Set<Integer> set, int n) {
        long startTime = System.nanoTime();
        set.contains(n);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long removeTime(Set<Integer> set, int n) {
        long startTime = System.nanoTime();
        set.remove(n);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long addTime(Map<Integer, Integer> map, int n) {
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++)
            map.put(map.size() + i, map.size() + i);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long searchTime(Map<Integer, Integer> map, int key) {
        long startTime = System.nanoTime();
        map.containsKey(key);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long removeTime(Map<Integer, Integer> map, int key) {
        long startTime = System.nanoTime();
        map.remove(key);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
