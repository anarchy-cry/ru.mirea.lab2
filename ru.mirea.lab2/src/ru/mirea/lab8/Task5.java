package ru.mirea.lab8;

import java.util.Scanner;

public class Task5 {
    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }

        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = sc.nextInt();
        System.out.println("Сумма цифр: " + sumOfDigits(n));
    }
}
