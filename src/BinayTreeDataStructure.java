
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinayTreeDataStructure {

    TreeNode root;
    /** Finding Comming ancestors **/
    public TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {

        if(root == null)return null;// no more leafs
        else if (root.val == p || root.val ==q) return root;

        //searching p or q in left branch
        TreeNode left = lowestCommonAncestor(root.left, p,q);
        TreeNode right = lowestCommonAncestor(root.right, p,q);

        if(left != null && right !=null) return root;
        else if(left == null && right == null) return null;  // none of the branches contain neither p nor q thus - I am not lowest common ancestor
        else if (left!=null && right ==null) return left;
        else if (left==null && right !=null) return right;
        else return null;
    }


    /**
     * BFS-Min Depth ---Using a Queue data structure
     */
    public int minDepth(TreeNode root){
        if(root==null)return 0;

        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        int  count = 0;

        nodes.offer(root); // inserting root into head of queue

        while(!nodes.isEmpty()){

            /**poll return the first node from the head of the queue
             * now checking if its null, then return the current count
             * **/
            TreeNode curr = nodes.poll();

            if(curr.left ==null && curr.right ==null) break;
            if(curr.left!=null ){
                nodes.offer(curr.left);
            }
            if(curr.right!=null){
                nodes.offer(curr.right);
            }
            count ++;
        }
        return count;
    }

    /**
     * DFS-Min Depth--Using a stack
     */
    public int minDepthUsingDFS(TreeNode root){
        if(root == null) return 0;

        Stack<TreeNode> stackNodes= new Stack<TreeNode>();
        Stack<Integer> depth = new Stack<Integer>();
        stackNodes.push(root);
        depth.push(1);
        int min_depth = Integer.MAX_VALUE;

        while(!stackNodes.isEmpty()){

            TreeNode curr = stackNodes.pop();
            int current_depth = depth.pop();


            if(curr.left ==null && curr.right ==null) {
                min_depth = Math.min(current_depth, min_depth);
            }
            if(curr.right !=null){
                stackNodes.add(curr.right);
                depth.push(current_depth+1); }
            if(curr.left !=null){
                stackNodes.add(curr.left);
                depth.push(current_depth+1);
            }

        }
        return min_depth;
    }



    /**
     * BFS-Max Depth ---Using a Queue data structure
     */
    public int maxDepthUsingBFS(TreeNode Node){
        if(root==null)return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int  count = 0;
        queue.offer(root); // inserting root into head of queue

        while(!queue.isEmpty()){
            int size = queue.size();
            while(size --> 0){
                TreeNode curr = queue.poll();
                if(curr.left!=null){
                    queue.offer(curr.left);
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            count++;
        }
        return count;
    }


/**
 * DFS-Max Depth ---Using a Stack data structure
 */
public int maxDepthDFS(TreeNode root) {
    if(root == null) {
        return 0;
    }

    Stack<TreeNode> stack = new Stack<TreeNode>();
    Stack<Integer> height = new Stack<Integer>();
    stack.push(root);
    height.push(1);
    int max = 0;
    while(!stack.isEmpty()) {
        TreeNode node = stack.pop();
        int currentHeight = height.pop();
        max = Math.max(currentHeight, max);
        if(node.left != null) {
            stack.push(node.left);
            height.push(currentHeight+1);
        }
        if(node.right != null) {
            stack.push(node.right);
            height.push(currentHeight+1);
        }
    }
    return max;
}



    /**
     * RECURRSION - Minimum depth
     * **/
    private int count = Integer.MAX_VALUE;
    public int minDepthRecursion(TreeNode root) {
        if (root == null) {
            return 0;
        }

        dfs(root, 1);
        return count;
    }

    private void dfs(TreeNode node, int depth) {
        if (node.left == null && node.right == null) {
            if (depth < count) {
                count = depth;
            }
            return;
        }

        if (node.left != null) {
            dfs(node.left, depth + 1);
        }

        if (node.right != null) {
            dfs(node.right, depth + 1);
        }
    }
}

/** Definition for a binary tree node. **/
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}