package ru.mirea.lab13;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String flat;

    public void parseWithSplit(String s) {
        String[] parts = s.split(",");

        setFields(parts[0].trim(), parts[1].trim(), parts[2].trim(), parts[3].trim(),
                parts[4].trim(), parts[5].trim(), parts[6].trim());
    }

    public void parseWithTokenizer(String s) {
        StringTokenizer st = new StringTokenizer(s, ",.;");
        String[] parts = new String[7];
        int i = 0;
        while (st.hasMoreTokens() && i < 7) {
            parts[i] = st.nextToken().trim();
            i++;
        }
        setFields(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
    }

    private void setFields(String country, String region, String city, String street,
                           String house, String building, String flat) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.building = building;
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "Страна: " + country + " | Регион: " + region + " | Город: " + city
                + " | Улица: " + street + " | Дом: " + house + " | Корпус: " + building
                + " | Квартира: " + flat;
    }
}
