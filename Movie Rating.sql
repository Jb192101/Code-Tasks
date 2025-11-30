-- TaskLink: https://leetcode.com/problems/movie-rating/description/

(
SELECT u.name as results
FROM Users as u
INNER JOIN MovieRating as mr ON mr.user_id = u.user_id
GROUP BY u.user_id, u.name
ORDER BY COUNT(mr.rating) DESC, u.name ASC
LIMIT 1
)

UNION ALL
 (
SELECT m.title as results
FROM Movies as m 
INNER JOIN MovieRating as mr ON mr.movie_id = m.movie_id
WHERE EXTRACT(year FROM mr.created_at) = 2020 
  AND EXTRACT(month FROM mr.created_at) = 2
GROUP BY m.movie_id, m.title
HAVING AVG(mr.rating) = (
    SELECT MAX(avg_rating) 
    FROM (
        SELECT AVG(rating) as avg_rating
        FROM MovieRating 
        WHERE EXTRACT(year FROM created_at) = 2020 
          AND EXTRACT(month FROM created_at) = 2
        GROUP BY movie_id
    ) as subquery
)
ORDER BY m.title ASC
LIMIT 1
 );