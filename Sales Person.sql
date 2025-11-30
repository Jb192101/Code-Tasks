-- TaskLink: https://leetcode.com/problems/sales-person/description/

SELECT s.name FROM SalesPerson as s
WHERE s.sales_id NOT IN (
    SELECT sales_id FROM Company as c
    INNER JOIN Orders as o ON o.com_id = c.com_id
    WHERE c.name = 'RED'
);