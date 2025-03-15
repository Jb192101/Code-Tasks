/*
 Вам требуется реализовать структуру данных, выполняющую следующие операции:
 1. Добавить элемент x в конец структуры.
 2. Удалить последний элемент из структуры.
 3. Выдать минимальный элемент в структуре.
 
 Формат входных данных
 Впервой строке входного файла задано одно целое число n количество операций (1 <= n <= 10^6).
 В следующих n строках заданы сами операции. В i-й строке число ti тип операции (1, если опе
рация добавления, 2, если операция удаления, 3, если операция минимума). Если задана операция
 добавления, то через пробел записано целое число x элемент, который следует добавить в струк
туру ( -10^9 <= x <= 10^9). Гарантируется, что перед каждой операцией удаления или нахождения
 минимума структура не пуста.
 
 Формат выходных данных
 Для каждой операции нахождения минимума выведите одно число минимальный элемент в
 структуре. Ответы разделяйте переводом строки.
*/

import java.util.Scanner;
import java.util.Stack;

public class Task1 {
    public static void main(String [] args) {
        MyStack stack = new MyStack();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int op, el;
        for(int i = 0; i < n; i++) {
            op = scan.nextInt();
            switch(op) {
                case 1:
                    el = scan.nextInt();
                    stack.push(el);
                    break;
                case 2:
                    stack.delete();
                    break;
                case 3:
                    System.out.println(stack.getMinElement());
            }
        }

    }
}

class MyStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    MyStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    void push(int x) {
        if(stack.empty()) {
            minStack.push(x);
        } else {
            int lst = minStack.getLast();
            if(lst < x) {
                minStack.push(lst);
            } else {
                minStack.push(x);
            }
        }
        stack.push(x);
    }

    void delete() {
        stack.pop();
        minStack.pop();
        //System.out.println(stack);
    }

    int getMinElement() {
        return minStack.getLast();
    }
}
