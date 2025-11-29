-- TaskLink: https://leetcode.com/problems/employees-earning-more-than-their-managers/description/

SELECT name as Employee FROM Employee as e1
WHERE salary > (SELECT salary FROM Employee as e2 WHERE e2.id = e1.managerId);