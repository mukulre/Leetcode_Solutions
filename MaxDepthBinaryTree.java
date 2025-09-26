import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class MaxDepthBinaryTree {
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }

        return depth;
    }

    public static TreeNode buildTree(List<Integer> values) {
        if (values.isEmpty() || values.get(0) == -1) return null;

        TreeNode root = new TreeNode(values.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (!queue.isEmpty() && i < values.size()) {
            TreeNode current = queue.poll();

            if (values.get(i) != -1) {
                current.left = new TreeNode(values.get(i));
                queue.offer(current.left);
            }
            i++;

            if (i < values.size() && values.get(i) != -1) {
                current.right = new TreeNode(values.get(i));
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        List<Integer> values = Arrays.stream(inputArr).map(Integer::parseInt).toList();
        scanner.close();

        TreeNode root = buildTree(values);
        System.out.println(maxDepth(root));
    }
}
