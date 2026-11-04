package ru.mirea.lab8;

import java.util.Scanner;

public class Task6 {
    public static boolean isPrime(int n, int divisor) {
        if (divisor * divisor > n) {
            return true;
        }

        if (n % divisor == 0) {
            return false;
        }

        return isPrime(n, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n (> 1): ");
        int n = sc.nextInt();

        if (isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
