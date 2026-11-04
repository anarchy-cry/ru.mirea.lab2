package ru.mirea.lab14;

import java.util.regex.Pattern;

public class Task7 {
    public static boolean isStrong(String password) {
        boolean okLength = Pattern.matches("\\w{8,}", password);

        boolean hasUpper = Pattern.compile("[A-Z]").matcher(password).find();

        boolean hasLower = Pattern.compile("[a-z]").matcher(password).find();

        boolean hasDigit = Pattern.compile("\\d").matcher(password).find();

        return okLength && hasUpper && hasLower && hasDigit;
    }

    public static void main(String[] args) {
        String[] passwords = {"F032_Password", "TrySpy1", "smart_pass", "A007", "Qwerty_123"};
        for (String p : passwords) {
            System.out.println(p + " -> " + (isStrong(p) ? "надёжный" : "ненадёжный"));
        }
    }
}
