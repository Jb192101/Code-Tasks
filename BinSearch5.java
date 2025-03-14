/*
Это задача требует от вас написать сортировку слиянием для за заданного массива
 A= <a1 a2 ... an> .
 Разумеется, все не так просто. Мы хотим, чтобы вы не смогли сдать какой-нибудь asort(). А
 значит, мы попросим от вас посчитать количество инверсий в массиве. Для этого вам потребуется
 модифицировать стадию слияния массивов попробуйте понять, что происходит с числом инверсий
 при слиянии двух массивов. Мы подскажем, что в отсортированном массиве 0 инверсий, а операция
 merge принимает два отсортированных массива и сливает их в один большой отсортированный
 массив.
 Количество инверсий это количество пар (i j) таких, что i < j и ai > aj. Обратите внимание
 на то, что ответ может не влезать в 32-битный тип данных, если вы пишете не на python.
 
 Формат входных данных
 Первая строка входного файла содержит натуральное число n (1 n 100000) количество
 элементов массива. Вторая строка содержит n попарно различных элементов массива A целых
 неотрицательных чисел, не превосходящих 109.
 
 Формат выходных данных
 В первой строке выведите одно число количество инверсий в массиве.
 Во второй строке выведите отсортированный массив, элементы выводите через пробел.
*/

import java.util.Scanner;

public class Task5 {
    static long inversions = 0;

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        // ВВОД ДАННЫХ
        // Кол-во элементов
        int n;
        n = scan.nextInt();

        int[] x = new int[n];
        // Принятие данных
        for(int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
        }

        // Merge sort
        int [] result = mergeSort(x);
        System.out.println(inversions);
        for (int res : result) {
            System.out.print(res + " ");
        }
    }

    // merge sort
    private static int[] mergeSort(int[] x) {
        if (x == null) {
            return null;
        }

        if (x.length < 2) {
            return x;
        }

        int [] y = new int[x.length / 2];
        System.arraycopy(x, 0, y, 0, x.length / 2);

        int [] z = new int[x.length - y.length];
        System.arraycopy(x, x.length/2, z, 0, x.length - y.length);

        y = mergeSort(y);
        z = mergeSort(z);

        return mergeArray(y, z);
    }

    private static int [] mergeArray(int [] arrayA, int [] arrayB) {
        int[] arrayC = new int[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) {
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else if (arrayA[positionA] < arrayB[positionB]) {
                //inversions++;
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else {
                inversions++;
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }
        return arrayC;
    }
}