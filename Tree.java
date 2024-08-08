class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}
public class Tree {
    public void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public void preorder(TreeNode root){
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(TreeNode root){
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
public static void main(String[] args){
    TreeNode root=new TreeNode(4);
    root.left=new TreeNode(2);
    root.right=new TreeNode(5);
    root.left.left=new TreeNode(3);
    root.left.left.right=new TreeNode(9);
    root.left.left.right.left=new TreeNode(1);
    root.right.left=new TreeNode(7);
    root.right.right=new TreeNode(6);
    root.right.right.left=new TreeNode(8);
    Tree tree=new Tree();
    System.out.println("Inorder of the BST");
    tree.inorder(root);
    System.out.println("");
    System.out.println("preorder of the BST");
    tree.preorder(root);
    System.out.println("");
    System.out.println("postorder of the BST");
    tree.postorder(root);
}
}

