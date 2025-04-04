/*
 Водной компьютерной игре игрок выставляет в линию шарики разных цветов. Когда образуется
 непрерывная цепочка из трех и более шариков одного цвета, она удаляется из линии. Все шарики
 при этом сдвигаются друг к другу, и ситуация может повториться.
 Напишите программу, которая по данной ситуации определяет, сколько шариков будет сейчас
 уничтожено. Естественно, непрерывных цепочек из трех и более одноцветных шаров в начальный
 момент может быть не более одной.
 
 Формат входных данных
 Дано количество шариков в цепочке (не более 105) и цвета шариков (от 0 до 9, каждому цвету
 соответствует свое целое число).
 
 Формат выходных данных
 Требуется вывести количество шариков, которое будет уничтожено
*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ввод данных
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = scan.nextInt();
        }

        int destroyed = 0;
        int cnt = 1;
        int start;
        for(int i = 0 ; i < n; i++){
            for(int j = 1; j < n - i; j++){
                if(a[i + j - 1] == a[i + j]){
                    cnt++;
                }
                else
                    break;
            }
            if(cnt >= 3){
                destroyed += cnt;
                start = i;
                i = -1;
                while(start < n - cnt){
                    a[start] = a[start + cnt];
                    start++;
                }
                n = n - cnt;

                cnt = 1;
            }
            else
                cnt = 1;
        }
        System.out.println(destroyed);
    }
}

