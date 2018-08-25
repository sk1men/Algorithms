package Tree;


import java.util.Stack;

public class Tree {

    TreeNode root;

    void addNode(int value) {//2
        TreeNode newNode = new TreeNode(value);
        if (root == null) {
            root = newNode;
            return;
        } else {
            TreeNode current = root;
            while (true) {
                if (newNode.value < current.value) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = newNode;
                        return;
                    }
                } else {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = newNode;
                        return;
                    }
                }

            }
        }
    }


    void addNodeRec(int value) {
        root = addNodeRecInner(root, value);
    }

    private TreeNode addNodeRecInner(TreeNode current, int newValue) {
        if (current == null) {
            return new TreeNode(newValue);
        }

        if (newValue < current.value) {
            current.left = addNodeRecInner(current.left, newValue);
        } else {
            current.right = addNodeRecInner(current.right, newValue);
        }

        return current;
    }

    boolean checkTree0() {

        if (root == null) {
            return true;
        }

        int baseCounter = 0;
        TreeNode current = root;

        while (current.left != null) {
            baseCounter++;
            current = current.left;
        }
//        Stack.Stack<TreeNode> stack = new Stack.Stack<TreeNode>();
//        stack.push(current);
//
//        while (!stack.empty()){
//            current = stack.pop();
//
//        }
        return checkTree(root, baseCounter, 0);
    }

    boolean checkTree(TreeNode current, int high, int currentHigh) {
        if (current == null || (current.right == null && current.left == null)) {
            return Math.abs(high - currentHigh) <= 1;
        } else {
            return checkTree(current.left, high, currentHigh + 1) &&
                    checkTree(current.right, high, currentHigh + 1);
        }
    }

    public static int getHeight(TreeNode root) {
        if (root == null) return 0; // Base case
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true; // Base case
        int heightDiff = getHeight(root.left) - getHeight(root.right);
        if (Math.abs(heightDiff) > 1) {
            return false;
        } else { // Recurse
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public  static void main(String ... args){
        Tree tree = new Tree();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(12);

        tree.root = root;
//        tree.printTree();

        System.out.println(tree.contains(6));
    }

    public void printTree(){
        sortTree(root);
    }

    private void sortTree(TreeNode current) {
        if(current == null){
            return;
        }

        sortTree(current.left);
        System.out.println(current.value);
        sortTree(current.right);
    }

    public boolean contains(int value){
        return  find(root,value);
    }

    private boolean find(TreeNode current, int value) {
        if(current == null){
            return false;
        }
        if(current.value == value){
            return true;
        }
        if(current.value > value){
            return find(current.left,value);
        }else {
            return find(current.right,value);
        }
    }






    public Tree mirrorTree(Tree oldTree){
        //Given a Binary tree, create a new mirror tree without recursion
        if(oldTree == null){
            return null;
        }
        Tree newTree = new Tree();
        newTree.root = new TreeNode(oldTree.root.value);
//        newTree.root = mirrorTreeRecursion(oldTree.root);
        mirrorTreeRecursion(newTree.root,oldTree.root);
        return newTree;

    }

    private TreeNode mirrorTreeRecursion(TreeNode oldNode) {
        if(oldNode == null){
            return null;
        }
        TreeNode newNode = new TreeNode(oldNode.value);

        newNode.left = mirrorTreeRecursion(oldNode.left);
        newNode.right = mirrorTreeRecursion(oldNode.right);

        return newNode;
    }

    private void mirrorTreeRecursion(TreeNode newNode, TreeNode oldNode) {
        if (oldNode == null){return;}

        if(oldNode.left != null){
            newNode.left = new TreeNode(oldNode.left.value);
            mirrorTreeRecursion(newNode.left,oldNode.left);
        }

        if(oldNode.right != null){
            newNode.right = new TreeNode(oldNode.right.value);
            mirrorTreeRecursion(newNode.right,oldNode.right);
        }
    }
}



