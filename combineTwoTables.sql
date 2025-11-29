-- Task: Write a solution to report the first name, last name, city, and state of each person in the Person table. If the address of a personId is not present in the Address table, report null instead.
-- Return the result table in any order.

-- TaskLink: https://leetcode.com/problems/combine-two-tables/description/

SELECT p.firstName, p.lastName, a.city, a.state FROM (Person as p LEFT JOIN Address as a ON a.personId = p.personId);