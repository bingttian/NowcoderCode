/*
�������ǽ��ܶ������������л��ķ�ʽ���������л��Ľ���ַ���Ϊstr��
��ʼʱstr���ڿ��ַ����������������������������սڵ㣬
����str��ĩβ���ϡ�#!������#����ʾ����ڵ�Ϊ�գ��ڵ�ֵ�����ڣ�
��Ȼ��Ҳ�����������������ַ�����!����ʾһ��ֵ�Ľ�����
���������Ϊ�յĽڵ㣬����ڵ�ֵΪ3������str��ĩβ���ϡ�3!����
��������ʵ�������������л���
�������ĸ����root���뷵�ض��������л�����ַ�����
*/
//�ύʱ�䣺2017-01-05 ���ԣ�Java ����ʱ�䣺 113 ms ռ���ڴ棺7798K ״̬������ȷ
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