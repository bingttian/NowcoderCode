/*
首先我们介绍二叉树先序序列化的方式，假设序列化的结果字符串为str，
初始时str等于空字符串。先序遍历二叉树，如果遇到空节点，
就在str的末尾加上“#!”，“#”表示这个节点为空，节点值不存在，
当然你也可以用其他的特殊字符，“!”表示一个值的结束。
如果遇到不为空的节点，假设节点值为3，就在str的末尾加上“3!”。
现在请你实现树的先序序列化。
给定树的根结点root，请返回二叉树序列化后的字符串。
*/
//提交时间：2017-01-05 语言：Java 运行时间： 113 ms 占用内存：7798K 状态：答案正确
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
public class TreeToString {
    public String toString(TreeNode root) {
      LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        String str = "";
        qian_fun(root, queue);
        while (!queue.isEmpty()) {
            if (queue.peek() == null) {
                queue.pop();
                str += "#!";
            } else {
                str += queue.pop().val + "!";
            }
        }
        return str;
    }
 
    public static void qian_fun(TreeNode root, LinkedList<TreeNode> list) {
        if (root == null) {
            list.add(null);
            return;
        }
        list.add(root);
        qian_fun(root.left, list);
        qian_fun(root.right, list);
    }
}