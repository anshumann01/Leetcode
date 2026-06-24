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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            int size = q.size();
            while(size-->0) {
                TreeNode f = q.poll();
                l.add(f.val);
                if(f.left!=null) q.add(f.left);
                if(f.right!=null) q.add(f.right);
            }
            ans.add(l);
        } 

       ArrayList<Integer> lastElements = new ArrayList<>();

for (int i = 0; i < ans.size(); i++) {
    List<Integer> currentRowInAns = ans.get(i); 
    if (!currentRowInAns.isEmpty()) {
        int lastIndex = currentRowInAns.size() - 1;
        lastElements.add(currentRowInAns.get(lastIndex));
    }
}
    return lastElements;
    }
}