/* A binary tree node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public int findDist(Node root, int a, int b) {
        // code here
        Node lca=LCA(a,b,root);
        int fDistance=dist(lca,a,0);
        int sDistance=dist(lca,b,0);
        return sDistance+fDistance;
    }
    private int dist(Node root, int a,int level) {
        if(root==null) return -1;
        if(root.data==a) return level;
        int leftDist=dist(root.left,a,level+1);
        if(leftDist!=-1) return leftDist;
        int rightDist=dist(root.right,a,level+1);
        return rightDist;
    }

    private Node LCA(int a, int b, Node root) {
        if(root==null) return root;
        if(root.data==a || root.data==b) return root;
        if(isPresent(root.left,a) && isPresent(root.right,b)) return root;
        if(isPresent(root.left,a) && isPresent(root.left,b)) return LCA(a,b,root.left);
        if(!isPresent(root.left,a) && !isPresent(root.left,b)) return LCA(a,b,root.right);
        if(!isPresent(root.left,a) && isPresent(root.right,b)) return root;
        return root;
    }
    public boolean isPresent(Node root,int target){
        if(root==null) return false;
        if(root.data==target) return true;
        return isPresent(root.left,target) || isPresent(root.right,target);
    }
}
