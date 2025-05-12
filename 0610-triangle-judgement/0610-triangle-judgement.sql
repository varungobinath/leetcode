# Write your MySQL query statement below
select *,IF((x+y<=z) or (y+z<=x) or (z+x<=y),"No","Yes") as triangle from triangle;