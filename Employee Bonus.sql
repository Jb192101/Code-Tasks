-- TaskLink: https://leetcode.com/problems/employee-bonus/description/

SELECT e.name, b.bonus 
FROM Employee as e LEFT JOIN Bonus as b ON b.empId = e.empId
WHERE b.bonus < 1000 OR b.bonus IS null;