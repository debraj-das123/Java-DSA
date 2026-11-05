package Tree;
// class Node{
//     int data;
//     Node left;
//     Node rigth;
//     Node(int data){
//         this.data = data;
//         left = null;
//         rigth = null;
//     }
// }
public class createTree {
    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(12);
        root.left.right = new TreeNode(34);
        System.out.println("Binary tree create successfull");
    }
}
