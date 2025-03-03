# Задача : Hardy's taxi (generalized)
# Ссылка : https://www.codewars.com/kata/525d87d2a1b088366a000f7c

from collections import defaultdict

def cab(a, n):
    sums = defaultdict(int)

    limit = int(a**(1/3)) + 1
    for i in range(1, limit):
        for j in range(i, limit):
            sum_of_cubes = i**3 + j**3
            if sum_of_cubes < a:
                sums[sum_of_cubes] += 1
    
    result = []
    for key, count in sums.items():
        if count == n:
            result.append(key)

    # Сортируем результат
    return sorted(result)