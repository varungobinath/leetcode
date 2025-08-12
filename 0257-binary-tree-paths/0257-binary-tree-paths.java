/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> lst = new ArrayList<>();
        if(root.left==null && root.right==null){
            lst.add(root.val+"");
            return lst;
        }
        dfs(root,new String(),lst);
        return lst;

    }
    public void dfs(TreeNode root,String str,List<String> lst){
        if(root==null) return;
        if(root.left==null && root.right==null){
            lst.add(str+root.val);
            return;
        }
        dfs(root.left,str+root.val+"->",lst);
        dfs(root.right,str+root.val+"->",lst);
    }
}