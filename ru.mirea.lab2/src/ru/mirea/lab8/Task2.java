package ru.mirea.lab8;

import java.util.Scanner;

public class Task2 {
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }

        printNumbers(n - 1);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = sc.nextInt();
        printNumbers(n);
        System.out.println();
    }
}
