/*
* https://leetcode.com/problems/big-countries/
*
* Quick SQL problem. There is a table named World that has the name of countries, populations and their area in square miles.
* The problem requests you write a SQL statement to return the name, population, and area of any country with either an area
* greater than 3,000,000 square miles OR a population of more than 25,000,000.
*
* Harder to test the query without going to leetcode since I don't have a DB setup but still backing it up anyway.
*/

SELECT name, population, area FROM World WHERE area > 3000000 OR population > 25000000;
