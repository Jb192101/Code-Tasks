-- TaskLink: https://leetcode.com/problems/not-boring-movies/description/
 
SELECT * FROM Cinema
WHERE description != 'boring' AND id % 2 = 1
ORDER BY rating DESC;