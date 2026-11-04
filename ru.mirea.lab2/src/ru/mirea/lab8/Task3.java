package ru.mirea.lab8;

import java.util.Scanner;

public class Task3 {
    public static void printFromAToB(int a, int b) {
        System.out.print(a + " ");

        if (a == b) {
            return;
        }

        if (a < b) {
            printFromAToB(a + 1, b);
        } else {
            printFromAToB(a - 1, b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите A: ");
        int a = sc.nextInt();
        System.out.print("Введите B: ");
        int b = sc.nextInt();
        printFromAToB(a, b);
        System.out.println();
    }
}
