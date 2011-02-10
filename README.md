  SELECT COUNT(1)
    FROM events
   WHERE time >= 2007-10-01T00:00
     AND time  < 2007-12-31T24:00
 CLUSTER BY card-id AT individual,
            time    AT day
SEQUENCE BY time ASCENDING
SEQUENCE GROUP BY card-id AT fare-group,
                  time    AT day
  CUBOID BY SUBSTRING (X, Y , Y , X)
    WITH X AT station,
         Y AT station
    LEFT MATCH (x1, y1, y2, x2)
    WITH x1.action = 'in'
     AND y1.action = 'out'
     AND y2.action = 'in'
     AND x2.action = 'out'