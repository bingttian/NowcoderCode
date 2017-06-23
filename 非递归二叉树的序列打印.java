/*
���÷ǵݹ鷽ʽʵ�ֶ���������������ͺ���ı�����ӡ��
����һ���������ĸ����root��
�����η��ض���������������ͺ�������(��ά�������ʽ)��
*/
//�ύʱ�䣺2017-01-05 ���ԣ�Java ����ʱ�䣺 319 ms ռ���ڴ棺5922K ״̬������ȷ
import java.util.*;
 
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class TreeToSequence {
    public int[][] convert(TreeNode root) {
     LinkedList<TreeNode> qian_list = new LinkedList<TreeNode>();
        LinkedList<TreeNode> zhong_list = new LinkedList<TreeNode>();
        LinkedList<TreeNode> hou_list = new LinkedList<TreeNode>();
        qian_fun(root, qian_list);
        zhong_fun(root, zhong_list);
        hou_fun(root, hou_list);
        int[][] res = new int[3][qian_list.size()];
        print(qian_list, res, 0);
        print(zhong_list, res, 1);
        print(hou_list, res, 2);
        return res;
    }
 
    public static void qian_fun(TreeNode root, LinkedList<TreeNode> list) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        stack.push(cur);
        while (!stack.isEmpty()) {
            cur = stack.pop();
            list.add(cur);
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
    }
 
    public static void zhong_fun(TreeNode root, LinkedList<TreeNode> list) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        stack.push(cur);
        TreeNode node = null;
        while (!stack.isEmpty()) {
            while (cur.left != null) {
                cur = cur.left;
                stack.push(cur);
            }
            node = stack.pop();
            list.add(node);
            if (node.right != null) {
                cur = node.right;
                stack.push(cur);
            }
        }
    }
 
    public static void hou_fun(TreeNode root, LinkedList<TreeNode> list) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        TreeNode cur = root;
        stack1.push(cur);
        while (!stack1.isEmpty()) {
            cur = stack1.pop();
            stack2.push(cur);
            if (cur.left != null) {
                stack1.push(cur.left);
            }
            if (cur.right != null) {
                stack1.push(cur.right);
            }
        }
        while (!stack2.isEmpty()) {
            list.add(stack2.pop());
        }
    }
 
    public static void print(LinkedList<TreeNode> list, int[][] res, int num) {
        int i = 0;
        while (!list.isEmpty()) {
            res[num][i++] = list.poll().val;
        }
    }
}