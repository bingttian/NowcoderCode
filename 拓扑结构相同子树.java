/*
对于两棵彼此独立的二叉树A和B，请编写一个高效算法，
检查A中是否存在一棵子树与B树的拓扑结构完全相同。
给定两棵二叉树的头结点A和B，请返回一个bool值，
代表A中是否存在一棵同构于B的子树。
*/
//提交时间：2016-12-19 语言：Java 运行时间： 37 ms 占用内存：772K 状态：答案正确
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
public class IdenticalTree {
    public static boolean chkIdentical(TreeNode A, TreeNode B) {
        String t1Str = treetostring(A);
        String t2Str = treetostring(B);
        //System.out.println(t1Str.toString());
        //System.out.println(t2Str.toString());
        return t1Str.contains(t2Str);
    }
     
    //把tree变成string
    public static String treetostring(TreeNode head){
         if(head == null){
                return "#!";
            }
               
            String res = head.val + "!";
            res += treetostring(head.left);
            res += treetostring(head.right);
        return res;
    }
}