package com.homework.hw3.part1;

import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < 30000; i++) {
            myList.add(i);
            list.add(i);
        }

        System.out.println("add in MyLinkedList: " + addTime(myList, 1000));
        System.out.println("add in LinkedList: " + addTime(list, 1000));
        System.out.println();
        System.out.println("indexOf in MyLinkedList: " + indexOfTime(myList, 100));
        System.out.println("indexOf in LinkedList: " + indexOfTime(list, 100));
        System.out.println();
        System.out.println("remove in MyLinkedList: " + removeTime(myList, 100));
        System.out.println("remove in LinkedList: " + removeTime(list, 100));
        System.out.println();

        MyLinkedList<Integer> myList2 = new MyLinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            myList2.add(i);
        }

        myList2.add(1);  //добавление в конец
        myList2.add(1, 2);  //добавление элемент по индексу
        System.out.println("добавили в конец 1 и добавили [1] на 2" + myList2);  //toString
        System.out.println(myList2.size());  //размер
        myList2.set(3, 8);  //заменв значения
        System.out.println("заменили [3] на 8" + myList2);
        myList2.add(50, 88);  //несуществующий индекс -> Index out of bounds.
        System.out.println(myList2.indexOf(9));  //такой индекс есть - 10
        System.out.println(myList2.indexOf(100));  //такого индекса нет -1
        System.out.println(myList2.remove(11)); //удаление 1
        System.out.println(myList2.size()); //теперь 11
        System.out.println(myList2);
        System.out.println(myList2.get(5)); //элемент по индексу 5 - 4
        System.out.println(myList2.get(-10)); //элемент несуществующего индекса Index out of bounds. null
        Integer[] intArray1 = myList2.toArray(new Integer[0]);
        Object[] intArray2 = myList2.toArray();
        System.out.println(intArray1.getClass());
        System.out.println(intArray2.getClass());
        myList2.clear();
        System.out.println(myList2);
    }

    static long addTime(MyLinkedList<Integer> list, int n) {
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            list.add(list.size() + i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    static long addTime(LinkedList<Integer> list, int n) {
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            list.add(list.size() + i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    static long indexOfTime(MyLinkedList<Integer> list, int n) {
        long startTime = System.nanoTime();
        list.indexOf(n);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    static long indexOfTime(LinkedList<Integer> list, int n) {
        long startTime = System.nanoTime();
        list.indexOf(n);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    static long removeTime(MyLinkedList<Integer> list, int n) {
        long startTime = System.nanoTime();
        list.remove(n);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    static long removeTime(LinkedList<Integer> list, int n) {
        long startTime = System.nanoTime();
        list.remove(n);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}