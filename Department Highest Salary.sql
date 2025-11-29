-- TaskLink: https://leetcode.com/problems/department-highest-salary/description/

SELECT d.name as Department, e.name as Employee, e.salary as Salary
FROM Employee as e
JOIN Department as d ON d.id = e.departmentId
WHERE e.salary = (SELECT MAX(salary) FROM Employee JOIN Department
ON Employee.departmentId = Department.id
WHERE e.departmentId = Department.id);