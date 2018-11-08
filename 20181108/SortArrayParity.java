import java.util.ArrayDeque;

/* https://leetcode.com/problems/sort-array-by-parity/
 *
 * Author: Colin Swan
 *
 * For this problem, given an array A, you must put all even numbers in that array at the
 * Beginning of an array, and all odd numbers after the even numbers.
 *
 * The way I did it was not the best way, but it was around 50-70% faster than other submissions
 *
 * Runtime: In the worst case, all numbers are Odd. Which means we go through the given array once,
 * and then a second time to pop all the odd numbers off the queue into a new array. Which makes
 * the runtime O(2n), simplified to O(n).
 *
 * A better way seems to be working from both ends of an array, So if a number is Even, add to the front, if Odd, add to the back.
 * This way you only have to go through the array One time. It would not be In Place though so the space requirement is still 0(n).
 */

public class SortArrayParity{

	public static int[] sortArrayByParity(int[] A) {
		ArrayDeque<Integer> odds = new ArrayDeque();
		
		int[] results = new int[A.length];
		int resultsIndex = 0;
		
		for(int curr: A){
		    if(curr%2 == 0){
			results[resultsIndex] = curr;
			resultsIndex++;
		    }
		    else{
			odds.push(curr);
		    }
		}
		
		while(!odds.isEmpty()){
		    results[resultsIndex] = odds.pop();
		    resultsIndex++;
		}
		
		return results;
	}

	public static void main(String[] args){
		int[] testInt = {4,3,1,2};
		int[] result = SortArrayParity.sortArrayByParity(testInt);

		for(int num: result){
			System.out.println(num);
		}
	}

}

