-- TaskLink: https://leetcode.com/problems/tree-node/description/

SELECT id, 
  CASE 
  WHEN p_id IS NULL THEN 'Root' 
  WHEN id NOT IN (SELECT p_id FROM Tree WHERE p_id IS NOT NULL) THEN 'Leaf'
  ELSE 'Inner' END as type 
FROM Tree;