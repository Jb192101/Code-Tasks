-- TaskLink: https://leetcode.com/problems/customers-who-never-order/description/

SELECT name as Customers FROM Customers

EXCEPT

SELECT c.name FROM Customers as c JOIN Orders as o ON o.customerId = c.id;