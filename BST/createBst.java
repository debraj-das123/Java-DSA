package BST;

public class createBst {
    public static TreeNode insert(TreeNode root, int value){
        if(root == null){
            return new TreeNode(value);
        }
        if(value < root.data){
            root.left = insert(root.left, value);
        }
        else if(value >= root.data){
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static TreeNode createNode(int arr[]){
        TreeNode root = null;
        for(int i =0; i<arr.length; i++){
            root = insert(root, arr[i]);
        }

        return root;
    }

    public static void inorder(TreeNode root){
        if(root ==  null){
            return ;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int arr[]= {50,30,70,20,40,60,80,100};

        TreeNode x = createNode(arr);
        System.out.println("BST inorder traversing");
        inorder(x);
    }
}
