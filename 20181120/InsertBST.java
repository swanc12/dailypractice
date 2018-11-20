/* https://leetcode.com/problems/insert-into-a-binary-search-tree/submissions/
 *
 * Author: Colin Swan
 *
 * Note: Does not compile without rest of code in leetcode.com
 *
 * This problem was just a basic Insert method for a BST. I used recursion for the
 * insertion. It ran in 2ms, faster than 96% of submissions. 
 */


/**
 *  * Definition for a binary tree node.
 *   * public class TreeNode {
 *    *     int val;
 *     *     TreeNode left;
 *      *     TreeNode right;
 *       *     TreeNode(int x) { val = x; }
 *        * }
 *         */


class InsertBST {

	public TreeNode insertIntoBST(TreeNode root, int val) {

	if(root.val < val){

		if(root.right == null){
			root.right = new TreeNode(val);
		}
		else{
			root.right = insertIntoBST(root.right, val);
		}

	}
	else{

		if(root.left == null){
			root.left = new TreeNode(val);
		}
		else{
			root.left = insertIntoBST(root.left, val);
		}

	}

	return root;
	}

	public static void main(String[] args){


	}
}
