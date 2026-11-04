package ru.mirea.lab9;

public class Tester {
    public static void main(String[] args) {
        Student[] iDNumber = {
                new Student(105, "Иван", 4.2),
                new Student(101, "Олег", 3.8),
                new Student(110, "Пётр", 4.9),
                new Student(103, "Денис", 3.5),
                new Student(108, "Артём", 4.5)
        };

        System.out.println("Исходный массив:");
        print(iDNumber);

        Sorting.insertionSort(iDNumber);
        System.out.println("\nПосле сортировки вставками по id:");
        print(iDNumber);

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(iDNumber, 0, iDNumber.length - 1);
        System.out.println("\nПосле быстрой сортировки по баллу (по убыванию):");
        print(iDNumber);
    }

    public static void print(Student[] arr) {
        for (Student s : arr) {
            System.out.println(s);
        }
    }
}
