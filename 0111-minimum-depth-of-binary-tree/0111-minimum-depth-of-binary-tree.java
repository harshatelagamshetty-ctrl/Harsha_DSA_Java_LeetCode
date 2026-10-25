class Solution {
    List<Integer> list;

    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        list = new ArrayList<>();
        level(root, 1);
        return Collections.min(list);
    }

    public void level(TreeNode root, int depth) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            list.add(depth);
            return;
        }

        level(root.left, depth + 1);
        level(root.right, depth + 1);
    }
}