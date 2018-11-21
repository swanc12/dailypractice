/*leetcode.com/problems/range-sum-of-bst/solution/
 *
 * Author: Colin Swan
 *
 * Description:
 *
 * Problem asked to implement a method to find the sum of a BST of values between L and R
 * This implementation works but is naive and can be made more efficient.
 */



/**
 *  * Definition for a binary tree node.
 * * public class TreeNode {
 * *     int val;
 * *     TreeNode left;
 * *     TreeNode right;
 * *     TreeNode(int x) { val = x; }
 * * }
 * */
class Solution {
public int rangeSumBST(TreeNode root, int L, int R) {

	int sum = 0;

	if(root.left != null){

		sum = rangeSumBST(root.left, L, R);

	}
	if(root.right != null){

		sum = sum + rangeSumBST(root.right, L, R);
	}

	//Base Case
	if(root.val >= L && root.val <= R){
			   
		return sum + root.val;
	}
	else{

		return sum;
	}
	}
}
