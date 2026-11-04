package ru.mirea.lab13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordChain {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = console.nextLine();

        Scanner fileScanner = new Scanner(new File(fileName));
        StringBuilder text = new StringBuilder();
        while (fileScanner.hasNextLine()) {
            text.append(fileScanner.nextLine()).append(" ");
        }
        fileScanner.close();
        String[] words = text.toString().trim().split("\\s+");

        StringBuilder result = getLine(words);
        System.out.println(result);
    }

    public static StringBuilder getLine(String... words) {
        for (int i = 0; i < words.length; i++) {
            boolean[] used = new boolean[words.length];
            int[] order = new int[words.length];
            used[i] = true;
            order[0] = i;
            if (build(words, used, order, 1)) {
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < order.length; k++) {
                    sb.append(words[order[k]]);
                    if (k < order.length - 1) {
                        sb.append(' ');
                    }
                }
                return sb;
            }
        }
        return new StringBuilder("Такую цепочку составить нельзя");
    }

    private static boolean build(String[] words, boolean[] used, int[] order, int count) {
        if (count == words.length) {
            return true;
        }
        String last = words[order[count - 1]];
        char lastChar = Character.toLowerCase(last.charAt(last.length() - 1));

        for (int i = 0; i < words.length; i++) {
            char firstChar = Character.toLowerCase(words[i].charAt(0));
            if (!used[i] && firstChar == lastChar) {
                used[i] = true;
                order[count] = i;
                if (build(words, used, order, count + 1)) {
                    return true;
                }
                used[i] = false;
            }
        }
        return false;
    }
}
