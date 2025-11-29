-- TaskLink: https://leetcode.com/problems/game-play-analysis-i/description/

SELECT DISTINCT a.player_id, min(a.event_date) as first_login FROM Activity as a
GROUP BY a.player_id;