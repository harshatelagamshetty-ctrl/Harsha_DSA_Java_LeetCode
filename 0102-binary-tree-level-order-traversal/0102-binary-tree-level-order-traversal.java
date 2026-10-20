class Solution {
    static class Pair {
        TreeNode node;
        int level;

        Pair(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) return ans;

        Queue<Pair> q = new LinkedList<>();
        List<Pair> list = new ArrayList<>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.remove();
            TreeNode node = p.node;
            int level = p.level;

            list.add(p);

            if (node.left != null)
                q.add(new Pair(node.left, level + 1));

            if (node.right != null)
                q.add(new Pair(node.right, level + 1));
        }

        for (Pair p : list) {
            int level = p.level;

            while (ans.size() <= level) {
                ans.add(new ArrayList<>());
            }

            ans.get(level).add(p.node.val);
        }

        return ans;
    }
}