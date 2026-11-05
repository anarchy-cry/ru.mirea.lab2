package ru.mirea.lab11;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Student {
    private String firstName;
    private String lastName;
    private Date birthDate;

    public Student(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getBirthDate(String format) {
        Locale ru = Locale.forLanguageTag("ru");
        SimpleDateFormat sdf;
        if (format.equals("short")) {
            sdf = new SimpleDateFormat("dd.MM.yy");
        } else if (format.equals("medium")) {
            sdf = new SimpleDateFormat("dd MMM yyyy", ru);
        } else {
            sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy", ru);
        }
        return sdf.format(birthDate);
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + ", дата рождения: " + getBirthDate("medium");
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2008, Calendar.JANUARY, 29);
        Student s = new Student("Максим", "Попов", cal.getTime());

        System.out.println(s);
        System.out.println("Короткий формат: " + s.getBirthDate("short"));
        System.out.println("Средний формат:  " + s.getBirthDate("medium"));
        System.out.println("Полный формат:   " + s.getBirthDate("full"));
    }
}
