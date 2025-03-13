// Задача с курса "Алгоритмы и Структуры Данных" Т-Банк
//   Найдите такое число x (x >= 0), что x^ 2+ sqrt(x+1) = C, с точностью не менее 6 знаков после точки.
// Формат входных данных
// В единственной строке содержится вещественное число 1 <= C <= 10^10.
// Формат выходных данных
// Выведите одно число искомый x.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numb;
        numb = scan.nextDouble();

        double l = 0;
        double r = Math.sqrt(numb);
        double x = 0, res;
        while (Math.abs(r - l) > 1e-6) {
            x = (l + r) / 2;
            res = x*x + Math.sqrt(x + 1);
            if (res < numb) {
                l = x;
            } else {
                r = x;
            }

        }
        System.out.println(x);

    }
}
