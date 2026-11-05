package ru.mirea.lab13;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;

    public Person(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public String getShortName() {
        StringBuilder sb = new StringBuilder(lastName);

        if (firstName != null && !firstName.isEmpty()) {
            sb.append(' ').append(firstName.charAt(0)).append('.');

            if (patronymic != null && !patronymic.isEmpty()) {
                sb.append(patronymic.charAt(0)).append('.');
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Person("Попов", "Максим", "Андреевич").getShortName());
        System.out.println(new Person("Усачева", "Анастасия", null).getShortName());
        System.out.println(new Person("Эдмон", null, null).getShortName());
    }
}
