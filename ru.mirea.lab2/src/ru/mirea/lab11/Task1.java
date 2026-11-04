package ru.mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        String developer = "Максим";

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        Calendar received = Calendar.getInstance();
        received.set(2026, Calendar.OCTOBER, 28, 10, 30, 0);

        Date now = new Date();

        System.out.println("Разработчик: " + developer);
        System.out.println("Задание получено: " + sdf.format(received.getTime()));
        System.out.println("Задание сдано:    " + sdf.format(now));
    }
}
