/*
 * https://leetcode.com/problems/max-increase-to-keep-city-skyline/
 *
 * Given a 2D array, for each entry, given the maximum value of its row and its column, increase the value of the element to the minimum of that set.
 * So for example, if grid[i][j] = 3, the maximum value in that row is 5, and the maximum value in that column is 10, increase grid[i][j] by 2.
 *
 * Return the sum of all these increases across the whole grid.
 *
 * This ran in 7ms, faster than 99% of java submissions. The runtime should be O(n*m) / O(n^2) where n is the length of the array and m
 * is the length of the arrays inside. This function
 * runs through the 2D array twice, so O(2nm) which simplifies to O(nm).
 *
 * Author: Colin Swan
 */

public class MaxIncreaseToKeepSkyline{

	//For each entry, increase the value to the largest number in either the row or the column, whichever is smaller of the two
    	public int maxIncreaseKeepingSkyline(int[][] grid) {

		 //Maximum value of each row and column. Maximum values for columns begin at an offset of grid.length.
		int[] maximumValues = new int[grid.length + grid[0].length];
		
		int sum = 0;
		//Populate maximum values array.
		for(int i = 0; i < grid.length; i++){ //rows
		    
		    for(int j=0; j < grid[0].length; j++){ //columns
			
			//Determine if current element is greater than max value in row thus far
			if(grid[i][j] > maximumValues[i]){
			    maximumValues[i]= grid[i][j]; //Set current max for this row to current element
			}
			
			//Determine if current element is greater than max value in Column thus far
			if(grid[i][j] > maximumValues[grid.length +j]){ //Maximum values of each column are offset by grid.length
			    maximumValues[grid.length+j] = grid[i][j];
			}
			
		    }
		}

		//Now that maximum values are stored, go through once more to determine the sum for how much the building sizes could be increased.
		
		for(int i = 0; i < grid.length; i++){
		    
		    for(int j = 0; j < grid[i].length; j++){
			
			int currentSmallMax = maximumValues[i];
			
			if(maximumValues[grid.length+j] < currentSmallMax){
			    currentSmallMax = maximumValues[grid.length+j];
			}
			
			if(grid[i][j] < currentSmallMax){
			    sum = sum + (currentSmallMax - grid[i][j]);
			}
		    }
		}
		
		return sum;
	}
	public static void main(String[] args){

		MaxIncreaseToKeepSkyline test = new MaxIncreaseToKeepSkyline();
		int[][] arr = new int[][]{
			{3,0,8,4},
			{2,4,5,7},
			{9,2,6,3},
			{0,3,1,0}
		};

		System.out.println(test.maxIncreaseKeepingSkyline(arr));
	}
}
