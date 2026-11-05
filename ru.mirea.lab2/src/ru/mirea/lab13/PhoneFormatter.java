package ru.mirea.lab13;

public class
PhoneFormatter {
    public static String format(String phone) {
        String countryCode;
        String number;

        if (phone.startsWith("+")) {
            countryCode = phone.substring(1, phone.length() - 10);
            number = phone.substring(phone.length() - 10);
        } else if (phone.startsWith("8") && phone.length() == 11) {
            countryCode = "7";
            number = phone.substring(1);
        } else {
            return "Неверный формат: " + phone;
        }

        return "+" + countryCode + number.substring(0, 3) + "-"
                + number.substring(3, 6) + "-" + number.substring(6);
    }

    public static void main(String[] args) {
        System.out.println(format("+79175655655"));
        System.out.println(format("+104289652211"));
        System.out.println(format("89175655655"));
    }
}
