package com.homework.hw2.ch1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ex13 {
    public static void lottery() {
        final int size = 49;
        Random random = new Random(System.currentTimeMillis());
        ArrayList<Integer> lottery = new ArrayList<>(size + 1);
        for (int i = 1; i <= size; i++) {
            lottery.add(i);
        }
        ArrayList<Integer> out = new ArrayList<>(6);
        for (var i = 0; i < 6; i++) {
            int pickIndex = random.nextInt(size - i);
            out.add(lottery.remove(pickIndex));
        }
        Collections.sort(out);
        for (int i : out) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
