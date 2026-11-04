package ru.mirea.lab11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        System.out.print("Введите дату в формате дд.мм.гггг: ");
        String input = sc.nextLine();

        try {
            Date userDate = sdf.parse(input);
            Date now = new Date();

            System.out.println("Текущая дата: " + sdf.format(now));
            System.out.println("Ваша дата:    " + sdf.format(userDate));

            if (userDate.before(now)) {
                System.out.println("Введённая дата РАНЬШЕ текущей");
            } else if (userDate.after(now)) {
                System.out.println("Введённая дата ПОЗЖЕ текущей");
            } else {
                System.out.println("Даты совпадают");
            }

            System.out.println("compareTo() = " + userDate.compareTo(now));
        } catch (ParseException e) {
            System.out.println("Неверный формат даты!");
        }
    }
}
