package ru.mirea.lab13;

public class Shirt {
    private String id;
    private String description;
    private String color;
    private String size;

    public Shirt(String id, String description, String color, String size) {
        this.id = id;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Код: " + id + "\n"
                + "Описание: " + description + "\n"
                + "Цвет: " + color + "\n"
                + "Размер: " + size + "\n";
    }

    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S101,Black Shirt,Black,XL";
        shirts[1] = "S102,Black Shirt,Black,L";
        shirts[2] = "S203,Blue Shirt,Blue,XL";
        shirts[3] = "S204,Blue Shirt,Blue,M";
        shirts[4] = "S305,Tan Shirt,Tan,XL";
        shirts[5] = "S206,Black T-Shirt,Black,XL";
        shirts[6] = "S407,White T-Shirt,White,XL";
        shirts[7] = "S408,White T-Shirt,White,L";
        shirts[8] = "S509,Green T-Shirt,Green,S";
        shirts[9] = "S610,Orange T-Shirt,Orange,S";
        shirts[10] = "S711,Maroon Shirt,Maroon,S";

        Shirt[] result = new Shirt[shirts.length];
        for (int i = 0; i < shirts.length; i++) {
            String[] p = shirts[i].split(",");
            result[i] = new Shirt(p[0], p[1], p[2], p[3]);
        }

        for (Shirt s : result) {
            System.out.println(s);
        }
    }
}
