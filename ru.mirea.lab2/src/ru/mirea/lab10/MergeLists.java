package ru.mirea.lab10;


public class MergeLists {
    public static void main(String[] args) {
        Student[] group1 = {
                new Student("Максим", "Смирнов", "Программная инженерия", 2, "ИКБО-01", 4.3),
                new Student("Егор", "Волков", "Программная инженерия", 2, "ИКБО-01", 4.8),
                new Student("Роман", "Зайцев", "Программная инженерия", 2, "ИКБО-01", 3.7)
        };
        Student[] group2 = {
                new Student("Илья", "Кузнецов", "Информатика", 2, "ИКБО-02", 3.9),
                new Student("Никита", "Белов", "Информатика", 2, "ИКБО-02", 4.5)
        };

        GpaComparator comp = new GpaComparator();

        SortingStudentsByGPA.mergeSort(group1, comp);
        SortingStudentsByGPA.mergeSort(group2, comp);

        Student[] all = SortingStudentsByGPA.merge(group1, group2, comp);

        System.out.println("Общий отсортированный список (по баллу, по убыванию):");
        for (Student s : all) {
            System.out.println(s);
        }
    }
}
