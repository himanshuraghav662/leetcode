class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        in(root,a);
        return a;
    }

    public void in(TreeNode root , ArrayList<Integer> b){
        if(root==null)
        return;
        in(root.left,b);
        b.add(root.val);
        in(root.right,b);
    }
}
