-- TaskLink: https://leetcode.com/problems/rising-temperature/

SELECT w1.id FROM Weather as w1
JOIN WEATHER as w2
ON w1.id != w2.id
WHERE w1.recordDate - w2.recordDate = 1 AND w1.temperature > w2.temperature;