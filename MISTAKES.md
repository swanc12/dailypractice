### November 12th, 2018
Used the incorrect variable in a line of the HammingDistance problem but found it pretty fast, other than that no issues

### November 8th, 2018
At first I wanted to use to ArrayDeques and convert a result ArrayDeque to an Array. This ended not working out efficiently.
The ArrayDeque wasn't able to be converted directly to an int[], only and Integer[], so it was more trouble than it was worth.
It probably would have been a worse runtime anyway given the overhead vs just pushing into an array.

### November 7th, 2018
Missed a semi-colon first time through, but no other major errors this time around!

### November 1st, 2018
Made an off by one error in the lowercase problem by not having the conditional be Greater Than OR EQUAL TO 'A'
Also rushed and had the conditional for if the letter was uppercase, but not to add anything when lowercase! So my first submission returned "h" instead of "hello".
This made me rethink the problem though, and I decided to instead initialize the StringBuffer with the given String and only replace letters that were uppercase.
This could be further optimized by converting the String to a Char array and doing something similar.

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
