package ru.mirea.lab8;

import java.util.Scanner;

public class Task4 {
    public static int count(int k, int s, boolean isFirst) {
        if (k == 0) {
            if (s == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        int result = 0;
        int start = isFirst ? 1 : 0;
        for (int digit = start; digit <= 9; digit++) {
            if (digit <= s) {
                result = result + count(k - 1, s - digit, false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите k (количество цифр): ");
        int k = sc.nextInt();
        System.out.print("Введите s (сумма цифр): ");
        int s = sc.nextInt();
        System.out.println("Количество чисел: " + count(k, s, true));
    }
}
