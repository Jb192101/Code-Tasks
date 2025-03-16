/*
 В постфиксной записи (или обратной польской записи) операция записывается после двух опе
рандов. Например, сумма двух чисел A и B записывается как A B +. Запись B C + D обозначает
 привычное нам (B + C) D, а запись A B C + D + означает A+(B +C) D. Достоинство
 постфиксной записи в том, что она не требует скобок и дополнительных соглашений о приоритете
 операторов для своего чтения.
 
 Формат входных данных
 В единственной строке записано выражение в постфиксной записи, содержащее цифры и операции +, , . Числа и операции разделяются пробелами. В конце строки может быть произвольное
 количество пробелов. Числа не превосходят 100 по модулю.
 
 Формат выходных данных
 Необходимо вывести значение записанного выражения.
*/

import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    public static void main(String [] args)
    {
        MyStack stack = new MyStack();

        Scanner scan = new Scanner(System.in);

        String[] inputLine = scan.nextLine().split(" ");

        int num1, num2, res = 0;
        for(int i = 0; i < inputLine.length; i++)
        {
            if(inputLine[i].equals("+") || inputLine[i].equals("-") || inputLine[i].equals("*")
                                                                    || inputLine[i].equals("*"))
            {
                num1 = Integer.parseInt(stack.pop());
                num2 = Integer.parseInt(stack.pop());
                switch(inputLine[i]) {
                    case "+":
                        res = num2 + num1;
                        break;
                    case "-":
                        res = num2 - num1;
                        break;
                    case "*":
                        res = num2 * num1;
                        break;
                    case "/":
                        res = num2 / num1;
                        break;
                }
                stack.push(String.valueOf(res));
            }
            else {
                stack.push(inputLine[i]);
            }
        }

        System.out.println(stack.pop());
    }
}

class MyStack {
    Stack<String> stack;
    MyStack() {
        stack = new Stack<>();
    }

    void push(String x) {
        stack.push(x);
    }

    String pop() {
        return stack.pop();
    }
}
