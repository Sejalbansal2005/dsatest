import java.util.ArrayList;
import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class InorderTraversal {
    public static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> elements = new ArrayList<>();

        System.out.println("Enter 4 elements to insert into the binary tree:");
        for (int i = 0; i < 4; i++) {
            elements.add(scanner.nextInt());
        }

        TreeNode root = null;
        for (int val : elements) {
            root = insert(root, val);
        }

        System.out.println("Inorder Traversal of the Binary Tree:");
        inorder(root);
    }
}
