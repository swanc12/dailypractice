import java.util.*;

/*
 * https://leetcode.com/problems/jewels-and-stones/
 *
 * Given two strings, if a character in string S is present in string J, increment by 1. Each character in S is a "Stone". Characters in J are considered "Jewels"
 * Go through each Stone in S and if that stone is a Jewel, increase the count by 1.
 *
 * Hashmap is very slightly faster for this purpose by about 4-5 ms on leetcode, though HashSet may be more conceptually appropriate.
 */

public class JewelsAndStones{

    	public int numJewelsInStones(String J, String S) {
		int totalJewels = 0;
		HashMap<Character, Boolean> jewels = new HashMap<>();
		for(char jewel: J.toCharArray()){
		    jewels.put(jewel, true);
		}
		for(char stone: S.toCharArray()){
		    if(jewels.containsKey(stone)){
			totalJewels++;
		    }
		}
		return totalJewels;
	}

	public static void main(String[] args){
		JewelsAndStones j = new JewelsAndStones();
		System.out.println(j.numJewelsInStones("aA", "aABBABAa")); // Should return the number 5
	}
}


