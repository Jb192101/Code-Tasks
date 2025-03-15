// Задача с курса "Алгоритмы и Структуры Данных" Т-Банк
//  В первой строке содержатся числа n и k (1 nk 105).
// Во второй строке задаются n элементов первого массива, отсортированного по возрастанию, а в
// третьей строке k вопросов. Все элементы целые, в диапазоне [ -10^9;10^9].

// Для каждого из k чисел второго массива выведите в отдельную строку "YES", если это число
// встречается в первом массиве, и "NO" в противном случае.

import java.util.Scanner;

public class BinSearch1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Кол-во элементов
        int count, k;
        count = scan.nextInt();
        k = scan.nextInt();

        // Формирование массивов
        int[] x = new int[count];
        int[] x2 = new int[k];

        // Принятие данных
        for(int i = 0; i < count; i++) {
            x[i] = scan.nextInt();
        }

        for(int i = 0; i < k; i++) {
            x2[i] = scan.nextInt();
        }

        // Основа
        int y;
        boolean isH;
        for(int el : x2) {
            isH = false;
            if(el < x[0] || el > x[count-1]) {
                System.out.println("NO");
                continue;
            }

            int l = 0;
            int r = count;

            while (r > l) {
                y = (l + r) / 2;
                if (x[y] == el) {
                    isH = true;
                    break;
                } else if (x[y] < el) {
                    l = y + 1;
                } else if (x[y] > el){
                    r = y + 1;
                }
            }

            if(isH) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

}