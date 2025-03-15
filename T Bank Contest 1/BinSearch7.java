/*
 Рассмотрим алгоритм быстрой сортировки, с выбором в качестве барьерного элемента среднего
 элемента на отрезке (q = a[(l + r) / 2])
 
 По данному числу n составьте тест, являющийся перестановкой чисел от 1 до n, на котором этот
 алгоритм выполняет наибольшее число сравнений (подсчитываются сравнения a[i] < q и q < a[j].
 
 Формат входных данных
 Программа получает на вход одно целое число n, 1 <= n <= 70000.
 
 Формат выходных данных
 Программа должна вывести перестановку чисел от 1 до n, на которой данная реализация алго
ритма быстрой сортировки Хоара будет выполнять наибольшее число сравнений.
 Можно вывести любой из возможных ответов.
*/

import java.util.Scanner;

public class Task7 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] x = new int[n];
        x[0] = 1;
        for(int i = 1; i < n; i++) {
            x[i] = x[i-1] + 1;
        }

        antiSort(x);

        for(int y : x) {
            System.out.print(y + " ");
        }

    }

    public static void antiSort(int[] array)
    {
        int swap;
        for (int a = 0; a < array.length; a++)
        {
            swap = array[a];
            array[a] = array[a/2];
            array[a/2] = swap;
        }
    }
}
