###October 30th, 2018
Mistakes during practice: In Java, when writing a regex for a function, you need to escape the backslash in a String.
For example, I was trying to use the String.replaceAll() method. I kept getting an error when I input
the following: replaceAll("\+.*\@");. It turned out I needed to use "\\+.*\\@" to escape the escape character, since
it was a regex being represented AS A STRING in Java, and \ is an escape character in Java strings. 
