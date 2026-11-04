package ru.mirea.lab13;

public class AddressTest {
    public static void main(String[] args) {
        String[] commaAddresses = {
                "Россия, Московская область, Москва, Тверская, 10, 1, 25",
                "Россия,Татарстан,Казань,Баумана,5,2,14"
        };

        String[] mixedAddresses = {
                "Россия; Ленинградская область; Санкт-Петербург; Невский проспект; 20; 3; 7",
                "Беларусь. Минская область, Минск; Ленина. 15, 1; 40"
        };

        Address a = new Address();

        System.out.println("а) split(\",\"):");
        for (String s : commaAddresses) {
            a.parseWithSplit(s);
            System.out.println(a);
        }

        System.out.println("\nб) StringTokenizer(\",.;\"):");
        for (String s : mixedAddresses) {
            a.parseWithTokenizer(s);
            System.out.println(a);
        }
    }
}
