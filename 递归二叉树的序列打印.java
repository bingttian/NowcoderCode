/*
请用递归方式实现二叉树的先序、中序和后序的遍历打印。
给定一个二叉树的根结点root，
请依次返回二叉树的先序，中序和后续遍历(二维数组的形式)。
*/
//提交时间：2017-01-04 语言：Java 运行时间： 225 ms 占用内存：5962K 状态：答案正确
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
       LinkedList<TreeNode> qian_list=new LinkedList<TreeNode>();
        LinkedList<TreeNode> zhong_list=new LinkedList<TreeNode>();
        LinkedList<TreeNode> hou_list=new LinkedList<TreeNode>();
        qian_fun(root,qian_list);
        zhong_fun(root,zhong_list);
        hou_fun(root,hou_list);
        int[][] res=new int[3][qian_list.size()];
        print(qian_list, res, 0);
        print(zhong_list, res, 1);
        print(hou_list, res, 2);
        return res;
    }
     
    public static void qian_fun(TreeNode root,LinkedList<TreeNode> list){
        if(root==null){
            return;
        }
        list.add(root);
        qian_fun(root.left, list);
        qian_fun(root.right, list);
    }
     
    public static void zhong_fun(TreeNode root,LinkedList<TreeNode> list){
        if(root==null){
            return;
        }
        zhong_fun(root.left, list);
        list.add(root);
        zhong_fun(root.right, list);
    }
     
    public static void hou_fun(TreeNode root,LinkedList<TreeNode> list){
        if(root==null){
            return;
        }
        hou_fun(root.left, list);
        hou_fun(root.right, list);
        list.add(root);
    }
     
    public static void print(LinkedList<TreeNode> list,int[][] res,int num){
        int i=0;
        while(!list.isEmpty()){
            res[num][i++]=list.poll().val;
        }
    }
}