-- TaskLink: https://leetcode.com/problems/nth-highest-salary/

CREATE OR REPLACE FUNCTION NthHighestSalary(N INT) RETURNS TABLE (Salary INT) AS $$
BEGIN
  RETURN QUERY (
    SELECT CASE WHEN N > 0 THEN (
        SELECT DISTINCT e.salary
        FROM Employee e
        ORDER BY e.salary DESC
        LIMIT 1 OFFSET GREATEST(N-1, 0)
    ) ELSE NULL END
  );
END;
$$ LANGUAGE plpgsql;