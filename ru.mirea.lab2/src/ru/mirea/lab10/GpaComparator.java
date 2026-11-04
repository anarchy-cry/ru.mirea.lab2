package ru.mirea.lab10;

import java.util.Comparator;

public class GpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if (a.getGpa() < b.getGpa()) {
            return 1;
        } else if (a.getGpa() > b.getGpa()) {
            return -1;
        } else {
            return 0;
        }
    }
}
