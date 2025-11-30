-- TaskLink: https://leetcode.com/problems/market-analysis-i/description/

SELECT user_id as buyer_id, join_date, COUNT(*) FILTER (WHERE EXTRACT(year FROM order_date) = 2019) as orders_in_2019
FROM Users 
LEFT JOIN Orders ON buyer_id = user_id
GROUP BY user_id, join_date
ORDER BY buyer_id;