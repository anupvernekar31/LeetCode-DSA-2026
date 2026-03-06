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
   //  public void helper(TreeNode root, List<Integer> ans ){
        
    //     if(root != null){
            
    //         helper(root.left, ans);
    //         helper(root.right, ans);
    //         ans.add(root.val);
    //     }
    // }
    // public List<Integer> postorderTraversal(TreeNode root) {
    //     List<Integer> ans = new ArrayList<>();
        
    //     helper(root, ans);
        
    //     return ans;
        
        
    // }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        
        TreeNode curr = root;

        while(curr!=null || !st.isEmpty()){
            if(curr!=null){
                st.push(curr);
                curr=curr.left;
            } else {
                TreeNode temp = st.peek().right;
                if(temp == null){
                    temp = st.peek();
                    st.pop();
                    ans.add(temp.val);
                    while(!st.isEmpty() && temp == st.peek().right){
                        temp = st.peek();
                        st.pop();
                        ans.add(temp.val);
                    }
                } else {
                    curr = temp;
                }
            }
        }
        return ans;
        
        
    }
}