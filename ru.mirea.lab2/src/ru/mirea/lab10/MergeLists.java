package ru.mirea.lab10;


public class MergeLists {
    public static void main(String[] args) {
        Student[] group1 = {
                new Student("Максим", "Попов", "Информатика ", 2, "КВБО-11-25", 4.3),
                new Student("Анастасия", "Усачева", "Информатика", 2, "КВБО-11-25", 4.8),
                new Student("Дарья", "Усачева", "Программирование", 2, "КСБО-11-25", 4.7)
        };
        Student[] group2 = {
                new Student("Эдмон", "Гарибян", "Информатика", 2, "КВБО-11-25", 4.9),
                new Student("Евгений", "Акинфеев", "Программирование", 2, "ЭФБО-01-25", 4.5)
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
