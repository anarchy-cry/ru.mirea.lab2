package ru.mirea.lab14;

import java.util.regex.Pattern;

public class Task3 {
    static final Pattern PRICE = Pattern.compile("\\d+(\\.\\d{2})?\\s(USD|RUB|EU)");

    public static void main(String[] args) {
        String text = "25.98 USD, 100 RUB, 44 ERR, 0.004 EU, 15.50 EU, 300.10 RUB";
        System.out.println("Текст: " + text);

        String[] prices = text.split(",");

        System.out.println("Правильные цены:");
        for (String price : prices) {
            price = price.trim();

            if (PRICE.matcher(price).matches()) {
                System.out.println("  " + price);
            }
        }
    }
}
