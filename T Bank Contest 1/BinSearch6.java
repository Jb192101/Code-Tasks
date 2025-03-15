/*
Дано кубическое уравнение ax3+bx2+cx+d = 0 (a != 0). Известно, что у этого уравнения ровно
 один корень. От вас требуется его найти.
 Заметьте, что разрешены различные случаи: любой из коэффициентов может быть положитель
ным, отрицательным, или все коэффициенты, кроме a, могут быть равны нулю.

 Формат входных данных
 Во входных данных через пробел записаны четыре целых числа: -1000 <= a, b, c, d <= 1000.
 
 Формат выходных данных
 Выведите единственный корень уравнения с точностью не менее 4 знаков после десятичной точ
ки.
*/

import java.util.Scanner;

public class Task6 {
    static int a, b, c, d;
    private static double f(double x) {
        return a*Math.pow(x, 3) + b*Math.pow(x, 2) + c*x + d;
    }

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();

        double l = -1000;
        double r = 1000;
        double x = 0;
        while(r - l > 1e-5)
        {
            x = (l + r) / 2;
            if (f(x) == 0) {
                break;
            } else if (f(x) * f(l) < 0) {
                r = x;
            } else {
                l = x;
            }

        }

        System.out.println(x);
    }
}