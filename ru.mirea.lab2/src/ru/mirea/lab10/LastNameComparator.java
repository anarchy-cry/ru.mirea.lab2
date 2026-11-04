package ru.mirea.lab10;


import java.util.Comparator;

public class LastNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getLastName().compareTo(b.getLastName());
    }
}
