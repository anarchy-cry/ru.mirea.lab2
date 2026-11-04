package ru.mirea.lab11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {
    static final int N = 20000;

    public static void main(String[] args) {
        test("ArrayList ", new ArrayList<Integer>());
        test("LinkedList", new LinkedList<Integer>());
    }

    public static void test(String name, List<Integer> list) {
        long start;

        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        long addTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.add(0, i);
        }
        long insertTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.indexOf(N - 1);
        }
        long searchTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.remove(0);
        }
        long removeTime = System.nanoTime() - start;

        System.out.println(name + ": добавление " + addTime / 1000 + " мкс, вставка "
                + insertTime / 1000 + " мкс, поиск " + searchTime / 1000
                + " мкс, удаление " + removeTime / 1000 + " мкс");
    }
}
