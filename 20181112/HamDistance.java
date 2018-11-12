
/* https://leetcode.com/problems/hamming-distance/discuss/187978/easy-with-Java
 *
 * Author: Colin Swan
 *
 * Find the hamming distance between two integers, which is just the number of bits that are
 * different between the two.
 *
 * Relatively straightforward, just XOR the two integers and count the number of bits
 * that are set in the resulting integer. There are details to be wary, such as
 * whether unsigned primatives should be used, but they don't seem to be considered
 * in this particular problem on Leetcode.
 *
 * This code ran in 5ms / faster than 100% of submissions on the first run. Second run
 * was 7ms, faster thant 60% of submissions, so most people get to an efficient solution here.
 */

public class HamDistance {
    public static int hammingDistance(int x, int y) {
        int xorInt = x ^ y;
        int count = 0;
        
	System.out.println(xorInt);
        while(xorInt > 0){//Counting the number of set bits after the XOR.
            count += xorInt & 1; //increment Count by the result of an AND of count and 0001.
            xorInt = xorInt >> 1; // Shift xorInt one byte to the right.
        }
        
        return count;
    }

    public static void main(String[] args){
		
	    System.out.println(HamDistance.hammingDistance(1,4));
    }

}
