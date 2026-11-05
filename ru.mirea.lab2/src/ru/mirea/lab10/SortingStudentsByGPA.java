package ru.mirea.lab10;


import java.util.Comparator;

public class SortingStudentsByGPA {
    private Student[] iDNumber;

    public void setArray() {
        iDNumber = new Student[] {
                new Student("Максим", "Попов", "Информатика ", 2, "КВБО-11-25", 4.3),
                new Student("Анастасия", "Усачева", "Информатика", 2, "КВБО-11-25", 4.8),
                new Student("Дарья", "Усачева", "Программирование", 2, "КСБО-11-25", 4.7)
        };
    }

    public void outArray() {
        for (Student s : iDNumber) {
            System.out.println(s);
        }
    }

    public void quickSort() {
        quickSort(iDNumber, 0, iDNumber.length - 1, new GpaComparator());
    }

    public void mergeSort() {
        mergeSort(iDNumber, new GpaComparator());
    }

    public void sortByLastName() {
        mergeSort(iDNumber, new LastNameComparator());
    }

    public static void quickSort(Student[] arr, int low, int high, Comparator<Student> comp) {
        if (low >= high) {
            return;
        }
        Student pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comp.compare(arr[j], pivot) < 0) {
                i++;
                Student t = arr[i]; arr[i] = arr[j]; arr[j] = t;
            }
        }
        Student t = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = t;
        int p = i + 1;

        quickSort(arr, low, p - 1, comp);
        quickSort(arr, p + 1, high, comp);
    }

    public static void mergeSort(Student[] arr, Comparator<Student> comp) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[arr.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        mergeSort(left, comp);
        mergeSort(right, comp);

        Student[] merged = merge(left, right, comp);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = merged[i];
        }
    }

    public static Student[] merge(Student[] a, Student[] b, Comparator<Student> comp) {
        Student[] result = new Student[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (comp.compare(a[i], b[j]) <= 0) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }
        while (j < b.length) {
            result[k++] = b[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        SortingStudentsByGPA tester = new SortingStudentsByGPA();

        tester.setArray();
        System.out.println("Исходный массив:");
        tester.outArray();

        tester.quickSort();
        System.out.println("\nБыстрая сортировка по баллу (по убыванию):");
        tester.outArray();

        tester.setArray();
        tester.mergeSort();
        System.out.println("\nСортировка слиянием по баллу (по убыванию):");
        tester.outArray();

        tester.sortByLastName();
        System.out.println("\nСортировка по фамилии:");
        tester.outArray();
    }
}
