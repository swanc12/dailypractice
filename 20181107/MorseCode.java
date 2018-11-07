import java.util.HashMap;
import java.lang.StringBuffer;

/* https://leetcode.com/problems/unique-morse-code-words/
 *
 * Author: Colin Swan
 *
 * Take an array of input Strings with all lowercase letters, convert those strings to morse code, and determine how many unique
 * morse code strings result.
 *
 * A couple notes: HashMap is faster than HashSet for some reason so I used that despite a HashSet probably being more appropriate
 * The way I created the dictionary was a bit hacky. Probably much more efficient, but would likely be worth the cost to use a 
 * HashMap to be easier conceptually to maintain in a real world scenario.
 *
 * These two concessions resulted in the code being 90-100% faster than other submissions though.
 */

public class MorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        String[] dictionary = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        //Find the translation for a letter by taking its ASCII value and subtracting 97
        //Not super intuitive but cleaner for the purposes of this exercise
        
        HashMap<String, Boolean> results = new HashMap<>();
        
        for(String word: words){
            StringBuffer morseWord = new StringBuffer();
            for(char currChar: word.toCharArray()){
                morseWord.append(dictionary[(int)currChar-97]);
            }
            results.put(morseWord.toString(), true);
        }
        
        return results.size();
    }


    public static void main(String[] args){

	    MorseCode test = new MorseCode();
	    String[] testString = {"gin", "zen", "gig", "msg"};
	    System.out.println(test.uniqueMorseRepresentations(testString));

    }

}
