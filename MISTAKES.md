### October 31st, 2018
Two major mistakes in the Skyline problem: 

1) I at first used the largest of the two max values instead of the smallest when determing how much an element could be increased!
2) I used incorrect syntax for 2D Arrays, using grid[i,j] instead of grid[i][j].

Both were silly mistakes, part of being rusty I suppose.
I also made a mistake when evaluating the Big O notation for the Skyline problem. It would be O(N*M), or O(N^2), where N is the
number of "columns" and M is the number of "rows".

### October 30th, 2018
Mistakes during practice: In Java, when writing a regex for a function, you need to escape the backslash in a String.
For example, I was trying to use the String.replaceAll() method. I kept getting an error when I input
the following: replaceAll("\+.*\@");. It turned out I needed to use "\\+.*\\@" to escape the escape character, since
it was a regex being represented AS A STRING in Java, and \ is an escape character in Java strings. 
