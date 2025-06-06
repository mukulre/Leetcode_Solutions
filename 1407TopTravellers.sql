SELECT u.name, IFNULL(SUM(distance),0) AS travelled_distance 
FROM Users u
LEFT JOIN Rides r ON u.id = r.user_id
GROUP BY u.id
ORDER BY SUM(distance) DESC, u.name