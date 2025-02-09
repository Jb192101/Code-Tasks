/*
Вам нужно написать функцию, которая получает список, размер которого всегда будет составлять не менее 3 чисел.
Пропущенный элемент никогда не будет первым или последним.

Пример
поиска пропущенных элементов([1, 3, 5, 9, 11]) == 7
PS: Это примерный вопрос из конкурса facebook engineering challenge на interviewstreet.
Мне показалось довольно забавным решать его на бумаге с помощью математики, выводя алгоритм таким образом.
Развлекайся!
 */

public class SequenceTask1 {
    public static int findMissing(int[] numbers)
    {
        if(numbers[0] == numbers[1]) {
            return numbers[0];
        }
        int div = (numbers[numbers.length - 1] - numbers[0]) / numbers.length;

        for(int i = 0; i < numbers.length-1; i++) {
            if(numbers[i+1] - div != numbers[i]) {
                return numbers[i+1] - div;
            }
        }
        return 0;
    }
}
