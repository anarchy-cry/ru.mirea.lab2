package ru.mirea.lab14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = sc.nextLine();

        Pattern separator = Pattern.compile("[\\s,.;:!?]+");
        String[] words = separator.split(text.trim());
        System.out.println("Слова (" + words.length + "):");
        for (String w : words) {
            System.out.println("  " + w);
        }

        Matcher m = Pattern.compile("\\d+").matcher(text);
        System.out.print("Числа в строке: ");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();

        System.out.println("Без лишних пробелов: " + text.replaceAll("\\s+", " "));

        Matcher big = Pattern.compile("\\b[A-ZА-ЯЁ]\\w*", Pattern.UNICODE_CHARACTER_CLASS).matcher(text);
        System.out.print("Слова с заглавной буквы: ");
        while (big.find()) {
            System.out.print(big.group() + " ");
        }
        System.out.println();
    }
}
