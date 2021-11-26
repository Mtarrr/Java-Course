package com.homework.hw3.part2;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        LinkedList<Integer> lList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            aList.add(i);
            lList.add(i);
        }

        System.out.println("add in ArrayList: " + Operations.addTime(aList, 100));
        System.out.println("add in LinkedList: " + Operations.addTime(lList, 100));
        System.out.println();
        System.out.println("insert in head of ArrayList: " + Operations.insertTime(aList, 2));
        System.out.println("insert in head of LinkedList: " + Operations.insertTime(lList, 2));
        System.out.println();
        System.out.println("insert at end of ArrayList: " + Operations.insertTime(aList, aList.size() - 2));
        System.out.println("insert at end of LinkedList: " + Operations.insertTime(lList, lList.size() - 2));
        System.out.println();
        System.out.println("ArrayList search: " + Operations.indexOfTime(aList, 1000));
        System.out.println("LinkedList search: " + Operations.indexOfTime(lList, 1000));
        System.out.println();
        System.out.println("ArrayList remove from head: " + Operations.removeTime(aList, 1));
        System.out.println("LinkedList remove from head: " + Operations.removeTime(lList, 1));
        System.out.println();
        System.out.println("ArrayList remove from end: " + Operations.removeTime(aList, aList.size() - 1));
        System.out.println("LinkedList remove from end: " + Operations.removeTime(lList, lList.size() - 1));
        System.out.println();
        System.out.println("--------------------------------------------------");

        HashSet<Integer> hashSet = new HashSet<Integer>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        for (int i = 0; i < 100000; i++) {
            hashSet.add(i);
            linkedHashSet.add(i);
            treeSet.add(i);
        }

        System.out.println("add in HashSet: " + Operations.addTime(hashSet, 100));
        System.out.println("add in LinkedHashSet: " + Operations.addTime(linkedHashSet, 100));
        System.out.println("add in TreeSet: " + Operations.addTime(treeSet, 100));
        System.out.println();
        System.out.println("HashSet search: " + Operations.searchTime(hashSet, 1000));
        System.out.println("LinkedHashSet search: " + Operations.searchTime(linkedHashSet, 1000));
        System.out.println("TreeSet search: " + Operations.searchTime(treeSet, 1000));
        System.out.println();
        System.out.println("HashSet remove from head: " + Operations.removeTime(hashSet, 2));
        System.out.println("LinkedHashSet remove from head: " + Operations.removeTime(linkedHashSet, 2));
        System.out.println("TreeSet remove from head: " + Operations.removeTime(treeSet, 2));
        System.out.println();
        System.out.println("HashSet remove from end: " + Operations.removeTime(hashSet, hashSet.size() - 2));
        System.out.println("LinkedHashSet remove from end: " + Operations.removeTime(linkedHashSet, linkedHashSet.size() - 2));
        System.out.println("TreeSet remove from end: " + Operations.removeTime(treeSet, treeSet.size() - 2));
        System.out.println();
        System.out.println("--------------------------------------------------");

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

        System.out.println("add in HashMap: " + Operations.addTime(hashMap, 100));
        System.out.println("add in LinkedHashMap: " + Operations.addTime(linkedHashMap, 100));
        System.out.println("add in TreeMap: " + Operations.addTime(treeMap, 100));
        System.out.println();
        System.out.println("HashMap search: " + Operations.searchTime(hashMap, 1000));
        System.out.println("LinkedHashMap search: " + Operations.searchTime(linkedHashMap, 1000));
        System.out.println("TreeMap search: " + Operations.searchTime(treeMap, 1000));
        System.out.println();
        System.out.println("HashMap remove from head: " + Operations.removeTime(hashMap, 2));
        System.out.println("LinkedHashMap remove from head: " + Operations.removeTime(linkedHashMap, 2));
        System.out.println("TreeMap remove from haed: " + Operations.removeTime(treeMap, 2));
        System.out.println();
        System.out.println("HashMap remove from end: " + Operations.removeTime(hashMap, hashMap.size() - 2));
        System.out.println("LinkedHashMap remove from end: " + Operations.removeTime(linkedHashMap, linkedHashMap.size() - 2));
        System.out.println("TreeMap remove from end: " + Operations.removeTime(treeMap, treeMap.size() - 2));

    }
}

